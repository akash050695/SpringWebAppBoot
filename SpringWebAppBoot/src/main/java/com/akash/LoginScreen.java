package com.akash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginScreen {

	@RequestMapping(method = RequestMethod.GET)
	public String loginController() {
		System.out.println("this is the login controller");
		return "Login";
	}
}
