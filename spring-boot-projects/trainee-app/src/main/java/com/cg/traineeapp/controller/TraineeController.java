package com.cg.traineeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.traineeapp.model.Trainee;
import com.cg.traineeapp.service.TraineeService;

@RestController
@RequestMapping("/trainees")
public class TraineeController {

	@Autowired
	private TraineeService service;
	
	@PostMapping
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		return service.addTrainee(trainee);
	}
	
	@GetMapping("/id/{id}")
	public Trainee getTrainee(@PathVariable int id) {
		return service.getTraineeById(id);
	}
	
	
}
