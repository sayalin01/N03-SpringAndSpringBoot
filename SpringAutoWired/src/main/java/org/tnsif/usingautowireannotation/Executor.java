package org.tnsif.usingautowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {
	public static void main(String[]args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("rmt.xml");
		Remote r = c.getBean("remote",Remote.class);
		r.remote();
	}

}
