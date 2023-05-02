package com.Music.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Music.demo.Model.RegistrationMusic;
import com.Music.demo.Service.RegistrationService;



@RestController
public class RegistrationController {
	@Autowired
    RegistrationService mService;
    @PostMapping("/registereduser")
    public RegistrationMusic saveRegistration(@RequestBody RegistrationMusic r)
    {
  	  return mService.saveRegistration(r);
    }
    @GetMapping("/fetchalldata")
    public List<RegistrationMusic> getAllUsers()
    {
   	 List<RegistrationMusic> musicList = mService.getAllUsers();
   	 return musicList;
    }

}
