package com.techtalentsouth.HappiestDay.Attendee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AttendeeController {

	@Autowired
	private AttendeeRepository attendeeRepository;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("Attendee/index.html");
		
		return mv;
	}
	
}
