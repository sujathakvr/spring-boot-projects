package com.ontarioinc.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}


	public Topic getTopicById(String id) {
		return topicRepository.findById(id).get();
	}


	public void addTopic(Topic t) {
		topicRepository.save(t);
	}


	public void updateTopic(Topic t, String id) {
		topicRepository.save(t);
	}


	public void deleteTopicById(String id) {
		topicRepository.deleteById(id);
	}
}
