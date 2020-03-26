package com.ls.microservices.LastStopDAOService.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sub")
public class Topic {

	@Id
	@Column(name="sub_id",insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int topicId;
	
	@Column(name="branch_id")
	private int chapterId;
	
	@Column(name="sub_name")
	private String topicName;

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
}
