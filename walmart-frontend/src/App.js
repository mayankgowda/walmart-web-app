import React from 'react';
import './App.css';

import Container from 'react-bootstrap/Container';
import {useState} from 'react';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import HomeScreen from './screens/Homescreen';
import Recommendations from './screens/Recommendations';
import { Link } from 'react-router-dom';

function App() {


  return (
    // <Router >
    <div className="container">
      <header className="header">
      <Link to='/'>
        <h1>Walmart</h1>
        </Link>
      </header>
      <Routes>
      <Route exact path='/' element={<HomeScreen/>}/>
      <Route exact path='/product/:id' element={<Recommendations/>}/>
      </Routes>
      

    </div>
    // </Router>
  );
}

export default App;
