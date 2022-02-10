package com.cg.traineeapp.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.traineeapp.model.Project;
import com.cg.traineeapp.model.Trainee;
import com.cg.traineeapp.repository.ProjectRepo;
import com.cg.traineeapp.repository.TraineeRepo;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRepo traineeRepo;
	
	@Autowired
	private ProjectRepo projectRepo;
	
	@PostConstruct
	public void init() {
		
//		Trainee t1 = new Trainee(5001,"Mahesh","rmahesh@yahoo.com");
//		Trainee t2 = new Trainee(5002,"Tushar","tushar@yahoo.com");
//		
//		List<Trainee> trainees = Arrays.asList(t1,t2);
//		
//		Project p1 = new Project(1002,"Book App","Java",LocalDate.of(2022, 2, 12),trainees);
////		Trainee t1 = new Trainee(5002,"Mahesh","rmahesh@yahoo.com",p1);
////		
//		traineeRepo.save(t1);
//		traineeRepo.save(t2);
//		projectRepo.save(p1);
		
		
//		Trainee trainee =  traineeRepo.findById(5002).get();
//		
//		System.out.println(trainee);
		
//		Project project = projectRepo.findById(1002).get();
		
//		System.out.println(project);
		
		
	}
	
	public Trainee addTrainee(Trainee trainee) {
		return traineeRepo.save(trainee);
	}
	
	public Trainee getTraineeById(int traineeId) {
		return traineeRepo.findById(traineeId).orElse(null);
	}
	
	
}
