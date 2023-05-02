package com.Music.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Music.demo.Model.LoginMusic;
import com.Music.demo.Repository.LoginRepository;

@Service
public class LoginService {
	

		@Autowired
		private LoginRepository repository;
		
		public String checkLogin(String username, String password) {
		    LoginMusic user = repository.findByusername(username);
		    if (user == null) {
		      return "User Not Found";
		    }
		    else{
		    	if(user.getPassword().equals(password)) {	    		
		    		return"Login Succesfull"; 
		    	}
		    	else {
		    		return "Login Failed";
		    	}
		    }
		}
		public LoginMusic addUser(LoginMusic music) {
			return repository.save(music);
		}
		public List<LoginMusic> getUser()
		{
			return repository.findAll();
		}
	}

