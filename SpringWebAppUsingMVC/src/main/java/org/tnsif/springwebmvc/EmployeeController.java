package org.tnsif.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Code to demonstrate on simple web apllication");
		return "home.jsp";
	}

}
