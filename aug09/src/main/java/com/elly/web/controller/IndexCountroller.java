package com.elly.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexCountroller {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
