package com.springsecurity.ctrl;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetCtrl {
	@ResponseBody
	@GetMapping("/greet/{name}")
	public String greetHandler(@PathVariable("name") String name) {

		return "Good Morning" + name;
	}
}
