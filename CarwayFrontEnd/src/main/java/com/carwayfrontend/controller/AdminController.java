package com.carwayfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AdminController  {

@RequestMapping("/login")
public ModelAndView login(){
	ModelAndView mv=new ModelAndView("loginpage");
	return mv;
}
}
