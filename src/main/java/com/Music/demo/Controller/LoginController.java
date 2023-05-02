package com.Music.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Music.demo.Model.LoginMusic;
import com.Music.demo.Service.LoginService;


@RestController
@RequestMapping("/musicbody")
public class LoginController 
	{
@Autowired
private LoginService service;

@PostMapping("/login")
public String login(@RequestBody Map<String, String> loginData) 
{
  String username = loginData.get("username");
  String password = loginData.get("password");
  String result = service.checkLogin(username, password);
  return result;
}
@PostMapping("/adduser")
public LoginMusic AddUser(@RequestBody LoginMusic music) 
{
	 return service.addUser(music);
}
@GetMapping("/get")
public List<LoginMusic> listAll()
{
	return service.getUser();
}


}
