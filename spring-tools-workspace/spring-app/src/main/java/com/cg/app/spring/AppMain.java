package com.cg.app.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		Car car = context.getBean(Car.class);
		
		car.startMusic();
		
		car.stopMusic();
		
		car.showCarInfo();
		
		context.getBean(Car.class);
		context.getBean(Car.class);
		context.getBean(Car.class);
		context.getBean(Car.class);

	}

}
