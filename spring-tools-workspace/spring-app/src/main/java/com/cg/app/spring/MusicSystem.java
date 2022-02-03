package com.cg.app.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor

@Component("jbl")
@Scope("prototype")
public class MusicSystem {

	//@Value("${ms.brand}")
	private String brand;
	//@Value("${ms.output}")
	private float output;
	
	public MusicSystem() {
		System.out.println("Music System Object Created");
	}
	
	public void play() {
		System.out.println("Playing Music..");
	}
	
	public void stop() {
		System.out.println("Stopped Music..");
	}
	
	
}
