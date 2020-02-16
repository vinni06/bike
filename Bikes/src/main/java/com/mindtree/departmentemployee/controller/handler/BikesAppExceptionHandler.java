package com.mindtree.departmentemployee.controller.handler;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.departmentemployee.exception.ServiceException;

@ControllerAdvice
public class BikesAppExceptionHandler {
	
@ExceptionHandler(ServiceException.class)
	public ModelAndView exceptionHandler(HttpServletRequest req,ServiceException c) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("status",HttpStatus.NOT_FOUND.value());
		mv.addObject("ErrorMessage",c.getMessage());
		mv.addObject("TimeStamp",new Date());
		mv.setViewName("error");
		return mv;
		
	}

}
