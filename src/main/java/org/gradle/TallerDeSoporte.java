package org.gradle;

import org.springframework.context.ApplicationContext;

public class TallerDeSoporte {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("/context.xml");
		Ingeniero ingeniero = (Ingeniero) applicationContext.getBean("ingeniero");
		Computadora computadora = new Computadora();
		ingeniero.reparar(computadora);
	}

}
