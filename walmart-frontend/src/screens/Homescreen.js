import React from 'react';

import ProductList from '../components/ProductList'
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import {useState} from 'react';


function Homescreen() {
    const [term, setTerm] = useState('');

    const [showSearchResults, setShowSearchResults] = React.useState(false);
  
    const handleSubmit = event => {
      
      event.preventDefault();
      
      setShowSearchResults(true);
  
    };
    return (
        <div>
            <Form onSubmit={handleSubmit} className="d-flex">
                  <Form.Control
                    type="search"
                    placeholder="Search"
                    className="me-2"
                    aria-label="Search"
                    onChange={(event) => {setTerm(event.target.value);  setShowSearchResults(false)}}
                  />
                  <Button variant="outline-success" onClick={handleSubmit}>Search</Button>
      </Form>
      
      {showSearchResults && <ProductList term={term}/>}
        </div>
    );

}

export default Homescreen;