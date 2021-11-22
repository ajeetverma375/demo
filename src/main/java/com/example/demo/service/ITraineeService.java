package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.InvalidFieldException;
import com.example.demo.exception.TraineeNotFoundException;
import com.example.demo.model.Trainee;



public interface ITraineeService 
{
	Trainee addTrainee(Trainee course) throws InvalidFieldException, TraineeNotFoundException;
	Trainee updateTrainee(Trainee course);
	Trainee viewTrainee(int courseId);
	List<Trainee> viewAllTrainee();
	Trainee deleteTrainee(int courseId);
	List<Trainee> viewAllTraineesByLocation(String location);
	Trainee viewTraineeByAadhar(long aadharNo);

}
