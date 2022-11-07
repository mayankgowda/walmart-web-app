package com.walmart.backend;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    final static Logger logger = LoggerFactory.getLogger(RecommendationController.class);

    // ID is SKU. Change in future.

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/recommend")
    public RecommendationResult search(@RequestParam(value = "id", defaultValue = "") String id) {

        logger.info("/recommend request received");
        logger.info("Product id  = " + id);

        Set<Integer> indexSet = new HashSet<>();
        Random rand = new Random();
        List<Product> recommendedProducts = new ArrayList<>();

        while(indexSet.size() < 20) {
            indexSet.add(rand.nextInt(Products.allProducts.size()));
        }

        for(int pid: indexSet) {
            recommendedProducts.add(Products.allProducts.get(pid));
        }
        return new RecommendationResult(recommendedProducts);

    }
}