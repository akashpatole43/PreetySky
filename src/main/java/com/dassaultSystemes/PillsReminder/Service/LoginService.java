package com.dassaultSystemes.PillsReminder.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dassaultSystemes.PillsReminder.Repository.LoginRepo;

@Service
public class LoginService {

	@Resource
	LoginRepo loginRepo;
	
	public void pub() {
		System.out.println("service class");
	}
}
