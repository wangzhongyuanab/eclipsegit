package com.example.demo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MovieBootController {
		
		
		@RequestMapping("/hello")
		public String sayHello(Model model) throws Exception {
			model.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
			if(true) {
				throw new Exception("some exception");
			}
			return "hello";
		}
		
		@RequestMapping("/welcome")
		public String welcome(Map<String,Object> map) {
			map.put("welcome", "welcome to thymeleaf");
			//给Thymeleaf准备数据
			return "result" ;
		}
}
