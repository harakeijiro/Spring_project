package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class calculatorService {

    public int calculate(int num1, int num2, String menu) {
    	int result = 0;
        switch (menu) {
            case "+":
            	result = num1 + num2;
                break;
            case "-":
            	result = num1 - num2;
                break;
            case "*":
            	result = num1 * num2;
                break;
            case "/":
            	result = num1 / num2;
                break;
            default:
            	System.out.println("計算できません。");
                break;
            }
            return result;
    }
}