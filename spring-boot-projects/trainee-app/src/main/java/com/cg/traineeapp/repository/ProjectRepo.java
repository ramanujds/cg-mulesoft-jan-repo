package com.cg.traineeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.traineeapp.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
