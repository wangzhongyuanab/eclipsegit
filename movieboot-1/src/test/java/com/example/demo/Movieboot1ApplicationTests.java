package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Movieboot1ApplicationTests {

	@Autowired
	Student student;
	
	Logger logger=LoggerFactory.getLogger(Movieboot1ApplicationTests.class);
	@Test
	public void contextLoads() {
		System.out.println(student);
	}
	
	@Test
	public void testLog() {//日志级别
		logger.trace("trace....");
		logger.debug("debug...");
		logger.info("info...");
		logger.warn("warn....");
		logger.error("error..");
	}
}
