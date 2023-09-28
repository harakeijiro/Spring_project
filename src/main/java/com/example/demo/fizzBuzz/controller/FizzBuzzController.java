package com.example.demo.fizzBuzz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;
    
    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping("/fizzbuzz")
    public String fizzBuzz(Model model) {
    	
        List<String> results = fizzBuzzService.createFizzBuzz();
        model.addAttribute("result", results);
        return "fizzBuzz";
    }
}