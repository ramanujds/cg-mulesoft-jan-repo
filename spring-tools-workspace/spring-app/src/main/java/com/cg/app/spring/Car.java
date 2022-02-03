package com.cg.app.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

@Scope("singleton")
@Lazy
public class Car implements InitializingBean, DisposableBean {
	
	@Value("${car.regno}")
	private String regno;
	@Value("${car.color}")
	private String color;
	
	@Autowired
	@Qualifier("sony")
	private MusicSystem musicSystem;
	
	public Car() {
		System.out.println("Car object Created");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Car is Ready..");
	}
	
	public void startMusic() {
		musicSystem.play();
	}
	
	public void stopMusic() {
		musicSystem.stop();
	}
	
	public void showCarInfo() {
		System.out.println(this);
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Car Object Destroyed..");
	}
	
}
