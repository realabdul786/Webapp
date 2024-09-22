package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {
	
	 
	// http://localhost:8080
	@RequestMapping (value= "/", method= RequestMethod.GET)
	public String openPage() {
		
		System.out.println("I came here for index.html page");
		
		return "index"; //in templates folder it check for index.html page must be present
	}
	
	// http://localhost:8080/about
	@RequestMapping (value= "/about", method= RequestMethod.GET)
	public String aboutUs() {
		
		System.out.println("I came here for about.html page");
		
		return "about"; //in templates folder it check for index.html page must be present
	}
	
	// http://localhost:8080/contact
	@RequestMapping (value= "/contact", method= RequestMethod.GET)
	public String contactUs() {
		
		System.out.println("I came here for contact.html page");
		
		return "contact"; //in templates folder it check for index.html page must be present
	}

}
