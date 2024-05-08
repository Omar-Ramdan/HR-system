package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

	
@ResponseBody
@RequestMapping("/home")
public String hi()
{
	return "hi";
}	
	

@RequestMapping("/welcomepage")
public String welcome() {
	
return "welcome";	
	
}

}
