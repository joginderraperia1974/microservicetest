package com.microservice.application.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;

@Controller
@RequestMapping(path = "/survey")
public class TestRestController {
	
	 @RequestMapping(path = "/testfirstrest/", method = RequestMethod.GET) 
	 public ResponseEntity<String> testFirstRest() {
		System.out.println("Rest API Called");		
		return new ResponseEntity<String>("Completed", HttpStatus.OK);

	  }  


}
