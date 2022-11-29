package com.Deployment.DeploymentDemosimple.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class SimpleController {
	
	@GetMapping("/home")
	public String Home()
	{
		return "Hello ";
	}

}
