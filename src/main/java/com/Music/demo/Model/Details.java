package com.Music.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Details {

	   @Id
	   @GeneratedValue
	   private Long id;
	   private int age;
	   private String fame;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFame() {
		return fame;
	}
	public void setFame(String fame) {
		this.fame = fame;
	}
	   

}
