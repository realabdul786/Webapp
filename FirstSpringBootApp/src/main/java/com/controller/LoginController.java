package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	
	@RequestMapping(value= "/login", method=RequestMethod.GET)
	public String openLoginPage() {
		
		System.out.println("Log In Page");
		return "login";
	}
	
	@RequestMapping (value= "/signIn", method =RequestMethod.POST)
	public String checkUserDetails(HttpServletRequest req) {  //DI for request Object
		
		String emailid=req.getParameter("emailid");
		String password=req.getParameter("password");
		
		if(emailid.equals("abdul.basit@cgi.com") && password.equals("1234")) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}
