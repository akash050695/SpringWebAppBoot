package com.akash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("helloworld")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String getMovie() {
		System.out.println("hi this is the controller");
		return "list";
	}

}