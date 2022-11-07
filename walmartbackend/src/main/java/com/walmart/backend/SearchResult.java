package com.walmart.backend;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    private final List<String> products;

    public SearchResult(List<Product> products) {
        this.products = new ArrayList<>();

        for(Product p: products)
            this.products.add(p.getId());
    }

    public List<String> getProducts() {
        return products;
    }
}