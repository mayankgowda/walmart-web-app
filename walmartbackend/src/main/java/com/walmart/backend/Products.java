package com.walmart.backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Products {
    public final static List<Product> allProducts = (new Products()).productList;

    private List<Product> productList;

    Products() {

        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/mayankgowda/workspace/walmartbackend/src/main/resources/static/products.json"))) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[10];
            while (reader.read(buffer) != -1) {
            	stringBuilder.append(new String(buffer));
            	buffer = new char[10];
            }
            reader.close();
            
            content = stringBuilder.toString();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
		TypeFactory typeFactory = objectMapper.getTypeFactory();
        try {
            List<Product> list = objectMapper.readValue(content, typeFactory.constructCollectionType(List.class, Product.class));
            productList = list;
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(allProducts.get(0).getId());
    }
}