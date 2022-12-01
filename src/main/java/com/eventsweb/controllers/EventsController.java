package com.eventsweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventsweb.models.Events;
import com.eventsweb.repository.EventsRepository;

@Controller
public class EventsController {
	
	@Autowired
	private EventsRepository er;
	
	@RequestMapping(value="/cadastrarEvento", method = RequestMethod.GET)
	public String form() {
		return "events/formEvents";
	}
	
	@RequestMapping(value="/cadastrarEvento", method = RequestMethod.POST)
	public String form(Events events) {
		er.save(events);
		
		return "events/formEvents";
	}
}
