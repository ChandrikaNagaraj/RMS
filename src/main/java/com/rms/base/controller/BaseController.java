package com.rms.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@RequestMapping("/myTest")
	public String GetString() {
		
		return "Hi";
		
}

}
