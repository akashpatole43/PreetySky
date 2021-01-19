package com.dassaultSystemes.PillsReminder.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dassaultSystemes.PillsReminder.Service.LoginService;

@Controller
public class MainController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value = "/hoo" , method= {RequestMethod.GET, RequestMethod.POST})
	public String home() {
		service.pub();
		return "login";
	}
}

