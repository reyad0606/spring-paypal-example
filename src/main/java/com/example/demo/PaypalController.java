package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PaypalController {

		@Autowired
		PaypalService service;
		
		@GetMapping("/")
		public String home() {
			return "home";
		}
}
