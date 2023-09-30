package com.example.demo.AnimalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.data.AnimalsData;
import com.example.demo.AnimalsAPI.repository.AnimalsRepository;

@Service
public class AnimalsService {

	private final AnimalsRepository animalsRepository;

	public AnimalsService(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
	}

	public List<AnimalsData> getAnimals() throws IOException {
		
        AnimalsData[] animalsList = animalsRepository.getAnimals();
        
        return Arrays.asList(animalsList);
	}
}