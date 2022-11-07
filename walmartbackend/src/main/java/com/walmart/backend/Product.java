package com.walmart.backend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Product {

	// @JsonProperty("PRODUCT_NAME")
	// private String productName;

	// @JsonProperty("DEPARTMENT")
	// private String department;

	// @JsonProperty("CATEGORY")
	// private String category;

	// @JsonProperty("SKU")
	// private String sku;

	// @JsonProperty("SELLER")
	// private String seller;

	// @JsonProperty("BRAND")
	// private String brand;

	// @JsonProperty("PRICE_CURRENT")
	// private String currentPrice;

	// @JsonProperty("PRICE_RETAIL")
	// private String retailPrice;

	// @JsonProperty("REVIEW_COUNT")
	// private String reviewCount;

	// @JsonProperty("REVIEW_RATING")
	// private String reviewRatings;

	// @JsonProperty("RunDate")
	// private String runDate	;

	private String id;
    private String category;
    private String title;
    private String description;
    private String brand;
    private String retail;
    private String price;
    private String offers;
    private String available;
    private String img;

	public Product() {
		super();
	}

	public Product(String id, String category, String title, String description, String brand, String retail,
			String price, String offers, String available, String img) {
		this.id = id;
		this.category = category;
		this.title = title;
		this.description = description;
		this.brand = brand;
		this.retail = retail;
		this.price = price;
		this.offers = offers;
		this.available = available;
		this.img = img;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRetail() {
		return retail;
	}

	public void setRetail(String retail) {
		this.retail = retail;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	
	
}