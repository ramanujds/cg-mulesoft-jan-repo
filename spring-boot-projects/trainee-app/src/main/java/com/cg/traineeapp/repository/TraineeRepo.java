package com.cg.traineeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.traineeapp.model.Trainee;

public interface TraineeRepo extends JpaRepository<Trainee, Integer> {

}
