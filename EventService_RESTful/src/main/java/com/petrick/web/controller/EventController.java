package com.petrick.web.controller;

import java.util.List;

import com.petrick.persistence.model.Event;
import com.petrick.persistence.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/event")
public class EventController {
	
	 @Autowired
	 private IEventService service;
	
	 
	 @RequestMapping(method = RequestMethod.GET)
	 @ResponseBody
	 public List<Event> findAll() {
		 return service.findAll();
	 }
	 
//	 @RequestMapping(method = RequestMethod.GET)
//	 @ResponseBody
//	 public List<Event> findAll() {
//		 return service.findAll();
//	 }
}
