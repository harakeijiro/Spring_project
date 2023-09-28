package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public List<String> createFizzBuzz() {
    	ArrayList<String> results = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                results.add("FizzBuzz");
            } else if (i % 3 == 0) {
                results.add("Fizz");
            } else if (i % 5 == 0) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }

        return results;
    }
}