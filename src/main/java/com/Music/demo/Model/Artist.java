package com.Music.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Artist {
	@Id
	@GeneratedValue
	     private Long id;
	     private String name;
	     private String email;
	     private String password;
	     @OneToOne(cascade=CascadeType.ALL)
	     @JoinColumn(name="details_id")
	     private Details details;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Details getDetails() {
			return details;
		}
		public void setDetails(Details details) {
			this.details = details;
		}
	     
}
