package com.kafka.producer.dto;

import lombok.Data;

@Data
public class Product {
	
	public String title;
    public String description;
    public String color;
    public int price;
    public boolean isInStock;

	public Product(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

}
