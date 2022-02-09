package com.cg.traineeapp.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trainee {

	@Id
	private int traineeId;
	
	private String traineeName;
	
	private String email;
	
	@ManyToOne
	private Project project;
	
	
}
