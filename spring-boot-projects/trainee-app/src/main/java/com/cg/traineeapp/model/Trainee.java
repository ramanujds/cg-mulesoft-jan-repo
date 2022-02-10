package com.cg.traineeapp.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "trainee_project_mapping")
	@JoinColumn(name = "project_id")
	private List<Project> projects;
	
	
}
