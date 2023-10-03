package com.kafka.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.consumer.dto.Product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConsumerListener {

	 @KafkaListener(topics = "${kafka.topic}")
	    public void consume(ConsumerRecord<String, Product> payload){ // Product Object spring.kafka.consumer.properties.spring.json.type.mapping mapped

	        System.out.println(payload.value());

	    }
}
