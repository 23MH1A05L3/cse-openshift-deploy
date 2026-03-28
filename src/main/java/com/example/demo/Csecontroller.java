package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	@GetMapping("/home")
	public String disp() {
//		return "WELCOME TO OPENSHIFT DEPLOYMENT";
		int number = 5; // change this to any number
        String result = "";

        for(int i = 1; i <= 10; i++) {
            result += number + " x " + i + " = " + (number * i) + "<br>";
        }

        return result;
	}
}