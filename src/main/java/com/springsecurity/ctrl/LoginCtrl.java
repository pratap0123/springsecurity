package com.springsecurity.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginCtrl {
	
@RequestMapping("/mylogin")
public String loginHandler() {
	
	return "login";
}
}
