package com.ontarioinc.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic t) {
		topicService.addTopic(t);
	}
	
	@PutMapping("/topics/{id}")
	public void addTopic(@RequestBody Topic t, String id) {
		topicService.updateTopic(t, id);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopicById(@PathVariable String id) {
		topicService.deleteTopicById(id);
	}
}
