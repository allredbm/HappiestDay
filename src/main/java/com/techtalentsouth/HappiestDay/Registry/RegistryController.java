package com.techtalentsouth.HappiestDay.Registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistryController {
	
	@Autowired
	private RegistryRepository registryRepository;
	
	@GetMapping("/registry")
	public ModelAndView index(Registry registryItem) {
		ModelAndView mv = new ModelAndView("registry/registry-main");
		mv.addObject("registryItems", registryRepository.findAll());
		
		return mv;
	}

	@PostMapping("/registry")
	public ModelAndView createPost(Registry registry) {
		ModelAndView mv = new ModelAndView("registry/registry-main");
		Registry post = registryRepository.save(registry);
		mv.addObject("registryItems", registryRepository.findAll());
		
		return mv;
	}
	
	@PutMapping(value="/registry")
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