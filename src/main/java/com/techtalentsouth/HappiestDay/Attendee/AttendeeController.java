package com.techtalentsouth.HappiestDay.Attendee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AttendeeController {

	@Autowired
	private AttendeeRepository attendeeRepository;
	
//	@GetMapping("/")
//	public ModelAndView index(Attendee attendee) {
//		ModelAndView mv = new ModelAndView("Attendee/index.html");
//		mv.addObject("attendees", attendeeRepository.findAll());
//		return mv;
//	}

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("Attendee/index.html");
		return mv;
	}

//	@GetMapping("/rsvp")
//	public ModelAndView rsvp(Attendee attendee) {
//		ModelAndView mv = new ModelAndView("Attendee/rsvp.html");
//		mv.addObject("attendees", attendeeRepository.findAll());
//		return mv;
//	}
	
	@GetMapping("/rsvp")
	public ModelAndView rsvp(Attendee attendee) {
		ModelAndView mv = new ModelAndView("Attendee/rsvp.html");
		mv.addObject("attendees", attendeeRepository.findAll());
		return mv;
	}

	@PostMapping(value="/rsvp")
	public ModelAndView addNewUser(Attendee attendee) {
		attendeeRepository.save(attendee);
		ModelAndView mv = new ModelAndView("Attendee/rsvp.html");
		mv.addObject("attendees", attendeeRepository.findAll());
		System.out.println(attendee);
		return mv;
	}
	
}
