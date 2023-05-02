package com.Music.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Music.demo.Model.RegistrationMusic;
import com.Music.demo.Repository.RegistrationRepository;



@Service
public class RegistrationService {
	    @Autowired
	    RegistrationRepository mRepository;
		public RegistrationMusic saveRegistration(RegistrationMusic r) 
		{
			return mRepository.save(r);
		}
		public List<RegistrationMusic> getAllUsers() 
		{
			 List<RegistrationMusic> musicList = mRepository.findAll();
		      return musicList;
		}

}
