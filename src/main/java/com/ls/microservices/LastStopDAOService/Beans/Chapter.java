package com.ls.microservices.LastStopDAOService.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Branch")
public class Chapter {

	@Id
	@Column(name="branch_id",insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int chapterId;
	
	@Column(name="branch_name")
	private String chapterName;
	
	@Column(name="main_id")
	private int courseId;

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Chapter [chapterId=" + chapterId + ", chapterName=" + chapterName + ", courseId=" + courseId + "]";
	}
	
	
}
