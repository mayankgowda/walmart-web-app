
import React, { Component } from 'react';
import ProductRow from './ProductRow';
import Axios from 'axios'
// import {useSearchParams} from 'react-router-dom'
class ProductList extends Component {
  constructor(props) {
    super(props);

    this.state = {
        products: [],
    }

  }

  componentDidMount() {
    console.log(this.props.term);
    Axios.get('http://localhost:8080/search?term='+this.props.term)
    .then(res => {
        console.log(res);
        const productids = res.data.products.slice(0,10);

        let products = [];
        productids.forEach((id)=> {Axios.get('http://localhost:8080/product?id='+id)
        .then(res => {
            console.log(res);
            const product = res.data;
            products = [...products, product];
            this.setState({products});
          }
        )});
    })
  }

  render() {

    return (
      <div className="container main-content">
        {
          this.state.products.map(product => {
            return <ProductRow key={product.id} image={product.img.split('|')[0]} title={product.title} description={product.description} price={product.price} retail={product.retail} id={product.id} />
          })
        }
      </div>
    );
  }
}

export default ProductList;