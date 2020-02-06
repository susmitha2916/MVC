package com.susmitha.jdbctemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susmitha.jdbctemplate.dao.TeacherDao;
import com.susmitha.jdbctemplate.model.Teacher;
@Service
public class TeacherService {
	@Autowired
	TeacherDao teacherdao;
	public List<Teacher> getallteacher(){
    	return teacherdao. getallteacher();
    }
}
