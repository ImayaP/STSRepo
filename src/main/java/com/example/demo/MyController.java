package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/welcome")
	public String returnSome() {
		return "Hi Hello and Welcome!!";
	}
}
