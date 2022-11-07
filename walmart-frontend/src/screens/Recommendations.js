import React, { Component } from 'react';

import RecommendList from '../components/RecommendList'

import { Link } from 'react-router-dom';
import Axios from 'axios'

class Recommendations extends Component {

    constructor(props) {
        super(props);
    
        this.state = {
            available: "",
            brand: "",
            category: "",
            description: "",
            id: "",
            img: "",
            offers: "",
            price: "",
            retail: "",
            title: "",
        }
      }

      
    
      componentDidMount() {
        
        console.log(window.location.pathname.split('/')[2]);
        Axios.get('http://localhost:8080/product?id='+window.location.pathname.split('/')[2])
        .then(res => {
            console.log(res);
            const product = res.data;
            
            this.setState({
                available: product.available,
                brand: product.brand,
                category: product.category,
                description: product.description,
                id: product.id,
                img: product.img.split('|')[0],
                offers: product.offers,
                price: product.price,
                retail: product.retail,
                title: product.title,
            
          });
        });
      }
      

    
    render() {
        
        console.log(window.location.pathname.split('/')[2])
        return (
            <div>
                
            <h2> Product Info</h2>
            <hr/>
            <div className="row product">
            <Link to={`/product/${window.location.pathname.split('/')[2]}`}>
            <div className="col-md-2">
            <img src={this.state.img} alt={this.state.title} height="150" />
            </div>
            </Link>
            <div className="col-md-8 product-detail">
            <h4>{this.state.title}</h4>
            </div>
            <div className="col-md-2 product-price">
                <b>Price: </b> <strike>${Math.round((this.state.retail/82.5) * 100) / 100}</strike>
            ${Math.round((this.state.price/82.5) * 100) / 100}
            </div>
        </div>
        <div className="row product">
            <b>Product Description: </b>
            {this.state.description}
        </div>
        <div className="row product">
        <div className="col-md-4">
            <b>Brand: </b>
            {this.state.brand}
            </div>
            <div className="col-md-4">
            <b>Categrory: </b>
            {this.state.category}
            </div>
            <div className="col-md-4">
            <b>Available: </b>
            {this.state.available}
            </div>
        </div>

                <h3>Recommendations</h3>

                <hr />
                <RecommendList id={this.state.id}/>
            </div>
        );
    }
}

export default Recommendations;