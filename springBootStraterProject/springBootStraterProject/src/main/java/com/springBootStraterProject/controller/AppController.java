package com.springBootStraterProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
@RequestMapping(value="/springboot")
public String first(){
	return "Welcome to spring boot";
	
	
}
@RequestMapping(value="/bootjsp")
public String first2(){
	return "success";



	
	

}
}