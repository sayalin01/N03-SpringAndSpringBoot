package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/empp")
	public String empp()
	{
		System.out.println("Code to demonstrate on simple web apllication");
		return "empp.jsp";
	}

}
