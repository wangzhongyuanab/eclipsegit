package com.example.demo.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public  ModelAndView  defaultErrorHandler(HttpServletRequest request,Exception exception) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("exception",exception);
		modelAndView.addObject("url",request.getRequestURI());
		modelAndView.setViewName("errorPage");
		return modelAndView;
	}
}
