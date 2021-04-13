package com.ontarioinc.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Java Script", "Java Script Description"),
			new Topic("spring", "Spring Core", "Spring Core Description")
			));
			
			
	public List<Topic> getAllTopics() {
		return topics;
	}


	public Topic getTopicById(String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}


	public void addTopic(Topic t) {
		topics.add(t);
	}


	public void updateTopic(Topic t, String id) {
		int k = 0;
		for (Topic topic: topics) {
			if (topic.getId().equals(id)) {
				topics.set(k, t);
			}
			k++;
		}
	}


	public void deleteTopicById(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}
}
