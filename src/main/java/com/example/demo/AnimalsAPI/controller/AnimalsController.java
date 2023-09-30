package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.AnimalsData;
import com.example.demo.AnimalsAPI.service.AnimalsService;

@Controller
public class AnimalsController {
	
	private final AnimalsService animalsService;

	public AnimalsController(AnimalsService animalsService) { 
		this.animalsService = animalsService;
	}

    @GetMapping("/search")
    public String getAnimals(Model model) throws IOException {
    	
    	List<AnimalsData> animalsList = animalsService.getAnimals();
    	
    	model.addAttribute("animalsList", animalsList);
    	
        return "AnimalsSearch";
    }
    
    @PostMapping("/detail")
    public String postAnimals(@RequestParam("id") int id, Model model) throws IOException {
    	
        List<AnimalsData> animalsList = animalsService.getAnimals();
        
        AnimalsData selectedAnimal = new AnimalsData();

        for (AnimalsData animal : animalsList) {
        	
            if (animal.getId() == id) {
            	
                selectedAnimal = animal;
                
                break;
            }
        }

        model.addAttribute("animal", selectedAnimal);
        return "AnimalsDetail";
    }
}