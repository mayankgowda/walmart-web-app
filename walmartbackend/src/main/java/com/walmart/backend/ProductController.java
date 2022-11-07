package com.walmart.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    final static Logger logger = LoggerFactory.getLogger(ProductController.class);

    // ID is SKU. Change in future.

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/product")
    public Product search(@RequestParam(value = "id", defaultValue = "") String id) {

        
        logger.info("/product request received");
        logger.info("Product id  = " + id);

        for(Product p: Products.allProducts) {

            if(p.getId().equalsIgnoreCase(id.trim()))
                return p;
        }


        return new Product();

    }
}