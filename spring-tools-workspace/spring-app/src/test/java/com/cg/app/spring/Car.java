package com.cg.app.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Car {

	private String regno;
	private String color;
	@Autowired
	private MusicSystem musicSystem;
	
	public void startMusic() {
		musicSystem.play();
	}
	
	public void stopMusic() {
		musicSystem.stop();
	}
	
	
	
}
