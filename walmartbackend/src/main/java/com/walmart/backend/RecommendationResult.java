package com.walmart.backend;

import java.util.List;
import java.util.ArrayList;

public class RecommendationResult {

    private final List<String> products;

    public RecommendationResult(List<Product> products) {
        this.products = new ArrayList<>();

        for(Product p: products)
            this.products.add(p.getId());
    }

    public List<String> getProducts() {
        return products;
    }
}