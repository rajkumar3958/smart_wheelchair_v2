package com.rajkumar3958.SmartWheelchairV2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class httpController {
	@GetMapping("/hello")
	String hello() {
		return "hello";
	}
}
