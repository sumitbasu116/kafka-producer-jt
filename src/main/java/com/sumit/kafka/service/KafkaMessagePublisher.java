package com.sumit.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagePublisher {

	@Autowired
	private KafkaTemplate<String,Object> template;
	
	public void sendMessageToTopic(String message) {
		template.send("sumit-topic-821",message);
	}
}
