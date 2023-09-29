package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.minusService;

@Controller
public class minusController {

    private final minusService minusService;

    public minusController(minusService minusService) {
        this.minusService = minusService;
    }

    @GetMapping("subtraction")
    public String doGet() {
        return "minus";
    }

    @PostMapping("subtract")
    public String subtract(@RequestParam int num1, @RequestParam int num2, Model model) {
        int result = minusService.subtract(num1, num2);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "minus";
    }
}