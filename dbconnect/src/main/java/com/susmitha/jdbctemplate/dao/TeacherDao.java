package com.susmitha.jdbctemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.susmitha.jdbctemplate.model.Teacher;

@Repository("teacherDao")
public class TeacherDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	public List<Teacher>   getallteacher(){
	   	
    	List<Teacher> teachers= template.query(
			    "select * from teacher",
			    new RowMapper() {         // RowMapper
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	Teacher std = new Teacher();
			        	std.setTid((rs.getInt("tid")));
			        	std.setName(rs.getString("name"));
			        	std.setSubject(((rs.getString("subject"))));
			            return std;
			        }
			    });
         return teachers;
    }    
}

