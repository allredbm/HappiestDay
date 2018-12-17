package com.techtalentsouth.HappiestDay.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistryController {
	
	@Autowired
	private RegistryRepository registryRepository;
	private static List<Registry> registryItems = new ArrayList<>();
	
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("registry/index");
		mv.addObject("registryItems", registryRepository.findAll());
		return mv;
	    }

	@GetMapping(value="/registry/new")
	public ModelAndView newPostForm(Registry registry) {
		ModelAndView mv = new ModelAndView("registry/new");
		return mv;
	}

	@PostMapping("/registry/new")
	public ModelAndView createPost(Registry registry) {
		ModelAndView mv = new ModelAndView("registry/index");
		Registry post = registryRepository.save(registry);
		mv.addObject("post", post);
		return mv;
	}
	
	@PutMapping(value="/registry/edit")
	public ModelAndView updatePost(Registry registry) {
		ModelAndView mv = new ModelAndView("redirect:/");
		registryRepository.save(registry);
		return mv;
	}
	
	@DeleteMapping(value="/registry/delete/{id}")
	public ModelAndView deletePost(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("redirect:/");
		registryRepository.deleteById(id);
		return mv;
	}
}