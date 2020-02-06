package com.susmitha.jdbctemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.susmitha.jdbctemplate.dao.TeacherDao;
import com.susmitha.jdbctemplate.model.Teacher;
import com.susmitha.jdbctemplate.service.TeacherService;

@Controller
public class HomeController {
	@Autowired
	TeacherService teacherservice;
	 
	@RequestMapping("/home")
	   String home() {
		   return "home";
	   }
	 @RequestMapping("/listteachers")
	   String getStudents(Model model) {
		   List<Teacher> list =teacherservice.getallteacher();
		 
		   model.addAttribute("liststud", list);
		   return "listteachers";
	   }
	   
	}


