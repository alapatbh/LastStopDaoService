package com.ls.microservices.LastStopDAOService.Beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="Main")
public class Course {
	
	@Id
	@Column(name="main_id",insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	
	@Column(name="course_name")
	@Size(max=10)
	private String courseName;
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
