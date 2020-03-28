package com.ls.microservices.LastStopDAOService.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
	
	@Id
	@Column(name="question_id",insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int questionId;
	
	@Column(name="sub_id")
	private int topicId;
	
	@Column(name="question_name")
	private String question;
	
	@Column(name="public")
	private char isPublic;
	
	@Column(name="enable")
	private char enable;

	@Column(name="difficulty")
	private char difficulty;
	
	private String answers;
	
	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public char getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(char difficulty) {
		this.difficulty = difficulty;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public char getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(char isPublic) {
		this.isPublic = isPublic;
	}

	public char getEnable() {
		return enable;
	}

	public void setEnable(char enable) {
		this.enable = enable;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", topicId=" + topicId + ", question=" + question + ", isPublic="
				+ isPublic + ", enable=" + enable + ", difficulty=" + difficulty + "]";
	}
	
}
