package com.ninja.Springboot_jenkins3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	
	@RequestMapping("/home")
	public String home()
	{
		return "hello home";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "hello about";
	}
}
