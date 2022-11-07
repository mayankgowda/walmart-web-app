package com.walmart.backend;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    final static Logger logger = LoggerFactory.getLogger(SearchController.class);

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/search")
    public SearchResult search(@RequestParam(value = "term", defaultValue = "") String term) {

        
        logger.info("/search request received");
        logger.info("Search term = " + term);
        List<Product> matchingProducts = new ArrayList<>();

        for(Product p: Products.allProducts) {
            if(matchingProducts.size() >= 20) break;

            if(p.getTitle().toLowerCase().contains(term))
                matchingProducts.add(p);
        }


        return new SearchResult(matchingProducts);

    }
}