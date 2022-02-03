package com.cg.app.spring;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MusicSystem {

	private String brand;
	private float output;
	
	public void play() {
		System.out.println("Playing Music..");
	}
	
	public void stop() {
		System.out.println("Stopped Music..");
	}
	
	
}
