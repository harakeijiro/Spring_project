package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.calculatorService;

@Controller
public class calculatorController {

    private final calculatorService calculatorService;

    public calculatorController(calculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("calculator")
    public String doGet() {
        return "calculator";
    }

    @PostMapping("calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String menu, Model model) {
        int result = calculatorService.calculate(num1, num2, menu);
        model.addAttribute("result", result);
        return "calculator";
    }
}