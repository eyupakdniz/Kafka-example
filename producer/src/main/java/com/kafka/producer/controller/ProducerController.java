package com.kafka.producer.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.dto.Product;
import com.kafka.producer.service.ProducerService;

@RestController
@RequestMapping("producer")
public class ProducerController {

	 @Autowired
	    ProducerService producerService;

	    @GetMapping
	    public String healthCheck(@RequestBody String message){

	        producerService.send(message);
	        return "Message is sent succesfully";

	    }

	    @PostMapping
	    public Product sendProductMessage(@RequestBody Product message){ // send json
	        producerService.send(message);
	        return message;
	    }
	    
	    @PostConstruct
	    public void generateMessage() {
	    	Product product = new Product("title","description","color","price","isInStock");
	    	producerService.send(product);
	    }
}
