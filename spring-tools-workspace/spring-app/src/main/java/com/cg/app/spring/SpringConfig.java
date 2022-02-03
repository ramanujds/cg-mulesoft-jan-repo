package com.cg.app.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.cg.app.spring"})
@PropertySource("app.properties")
public class SpringConfig {

	@Bean(name = "bose")
	@Scope("prototype")
	public MusicSystem getBoseMusicSystem() {
		MusicSystem musicSystem=new MusicSystem();
		musicSystem.setBrand("BOSE");
		musicSystem.setOutput(640.4F);
		return musicSystem;
	}
	
	@Bean(name = "sony")
	@Scope("prototype")
	public MusicSystem getSonyMusicSystem() {
		MusicSystem musicSystem=new MusicSystem();
		musicSystem.setBrand("SONY");
		musicSystem.setOutput(540.4F);
		return musicSystem;
	}
	
}
