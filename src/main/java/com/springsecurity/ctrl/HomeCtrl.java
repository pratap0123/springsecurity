package com.springsecurity.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeCtrl {

	
	@RequestMapping("/welcome")//secured and only access by Sonali
	@ResponseBody
	public String welcomeWorldHandler() {
		
		return "welcome...";
	}

	@RequestMapping("/helloworld")//secured and only access by Sonali
	@ResponseBody
	public String helloWorldHandler() {
		
		return "hellowolrd";
	}
	
	@RequestMapping("/hello")//secured and only access by Sonali
	public String helloHandler() {
		
		return "hello";
	}
	
	@RequestMapping("/hii")//secured and only access by Rohit
	@ResponseBody
	public String hiiHandler() {
		
		return "hii";
	}
}
