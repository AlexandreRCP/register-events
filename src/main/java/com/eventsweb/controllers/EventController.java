package com.eventsweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventsweb.models.Event;
import com.eventsweb.repository.EventRepository;

@Controller
public class EventController {
	
	@Autowired
	private EventRepository er;
	
	@RequestMapping(value="/registerEvent", method=RequestMethod.GET)
	public String form() {
		return "events/formEvent";
	}
	
	@RequestMapping(value="/registerEvent", method=RequestMethod.POST)
	public String form(Event event) {
		er.save(event);
		
		return "redirect:/registerEvent";
	}
	
	@RequestMapping("/events")
	public ModelAndView ListEvents() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Event> events = er.findAll();
		mv.addObject("events", events);
		return mv;
	}
	
	@RequestMapping("/{id}")
	public ModelAndView detailsEvent(@PathVariable("id") long id) {
		Event event = er.findById(id);
		ModelAndView mv = new ModelAndView("events/detailsEvent");
		mv.addObject("event", event);
		return mv;
	}
}
