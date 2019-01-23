package com.techtalentsouth.HappiestDay.Registry;

import java.util.Optional;

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
	
	@GetMapping("registry")
	public ModelAndView index(Registry registryItem) {
		ModelAndView mv = new ModelAndView("registry/registry-main");
		mv.addObject("registryItems", registryRepository.findAll());
		
		return mv;
	}

	@PostMapping("registry")
	public ModelAndView createPost(Registry registry) {
		ModelAndView mv = new ModelAndView("registry/registry-main");
		registryRepository.save(registry);
		mv.addObject("registryItems", registryRepository.findAll());
		
		return mv;
	}
	
	@GetMapping("registry/{id}")
	public ModelAndView edit(@PathVariable Long id, Registry registryItem) {
		Optional<Registry> registryItem1 = registryRepository.findById(id);
		
		if (!registryItem1.isPresent()) {
			ModelAndView mv = new ModelAndView("error");
			return mv;
        }
		
		ModelAndView mv = new ModelAndView("registry/registry-edit");
		mv.addObject("registryItem", registryItem1.get());
		
		return mv;
	}
	
	@PutMapping(value="registry/{id}")
	public ModelAndView updatePost(@PathVariable Long id, Registry registry) {
		Optional<Registry> registryItem1 = registryRepository.findById(id);
		
		if (!registryItem1.isPresent()) {
			ModelAndView mv = new ModelAndView("error");
			return mv;
        }
		
		Registry currentItem = registryItem1.get();
		currentItem.setItemName(registry.getItemName());
		currentItem.setItemURL(registry.getItemURL());
		currentItem.setImageURL(registry.getImageURL());
		currentItem.setDesireScale(registry.getDesireScale());
		registryRepository.save(currentItem);
		
		ModelAndView mv = new ModelAndView("redirect:/registry");
		
		return mv;
	}
	
	@DeleteMapping(value="registry/{id}")
	public ModelAndView deletePost(@PathVariable Long id) {
		registryRepository.deleteById(id);
		ModelAndView mv = new ModelAndView("redirect:/registry");
		mv.addObject("registryItems", registryRepository.findAll());
		
		return mv;
	}

}