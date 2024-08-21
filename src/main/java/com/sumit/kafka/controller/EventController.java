package com.sumit.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.kafka.service.KafkaMessagePublisher;

@RestController
@RequestMapping("/producer-app")
public class EventController {

	@Autowired
	private KafkaMessagePublisher publisher;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<?> publishMessage(@PathVariable String message){
		try {
			publisher.sendMessageToTopic(message);
		}catch(Exception e) {
			
		}
		return ResponseEntity.ok("message published successfully...");
	}
}
