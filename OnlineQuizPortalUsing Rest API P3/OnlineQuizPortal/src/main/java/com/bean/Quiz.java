package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quiz {
	@Id
	private int qid;
	private String category;
	private String topic;
	private String description;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getCategory() {
		return category;
	}
	public void setCatogory(String catogory) {
		this.category = catogory;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Quiz [qid=" + qid + ", category=" + category + ", topic=" + topic + ", description=" + description
				+ "]";
	}
	
	
	
}
