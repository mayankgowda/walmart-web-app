
import React, { Component } from 'react';
import { Link } from 'react-router-dom';

const ProductRow = ({ image, title, description, price, id, retail }) => {
  console.log(id+title);
    return (
      <div className="row product">
        <Link to={`/product/${id}`}>
        <div className="col-md-3">
          <img src={image} alt={title} height="150"/>
        </div>
        </Link>
        <Link to={`/product/${id}`}>
        <div className="col-md-7 product-detail">
          <h5>{title}</h5>
        </div>
        </Link>
        <div className="col-md-2 product-price">
            <b>Price: </b> <strike>${Math.round((retail/82.5) * 100) / 100}</strike>
          ${Math.round((price/82.5) * 100) / 100}
        </div>
      </div>
    );

    // return (
    //     <Card className='products'>
    //       {/* <Link to={`/product/${id}`}> */}
    //         <img src={image} className="card-img-top" alt={title} />
    //       {/* </Link> */}
    //       <Card.Body>
    //         {/* <Link to={`/product/${id}`}> */}
    //           <Card.Title>{title}</Card.Title>
    //         {/* </Link> */}
    //         <Card.Text>${price}</Card.Text>
    //         {/* {product.countInStock === 0 ? (
    //           <Button variant="light" disabled>
    //             Out of stock
    //           </Button>
    //         ) : (
    //           <Button onClick={() => addToCartHandler(product)}>Add to cart</Button>
    //         )} */}
    //       </Card.Body>
    //     </Card>
    //   );
}

export default ProductRow;