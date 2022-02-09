package com.cg.traineeapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

	@Id 
	private int projectId;
	private String projectName;
	private String platform;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate projectStartDate;
	@OneToMany(fetch = FetchType.EAGER)
	List<Trainee> trainees;
	
}
