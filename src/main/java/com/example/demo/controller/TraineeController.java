package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.InvalidFieldException;
import com.example.demo.exception.NoSuchRecordException;
import com.example.demo.exception.TraineeNotFoundException;
import com.example.demo.model.Trainee;
import com.example.demo.service.TraineeServiceImpl;

@RestController
public class TraineeController {
	private static final Logger LOG = LoggerFactory.getLogger(TraineeController.class);

	@Autowired
	private TraineeServiceImpl traineeservice;

	@PostMapping(path = "/trainee")
	public ResponseEntity<Trainee> addTrainee(@RequestBody Trainee course)
			throws InvalidFieldException, TraineeNotFoundException {
		ResponseEntity<Trainee> response = null;
		Trainee t = traineeservice.addTrainee(course);
		System.out.println("Trainee add");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "trainee added to database");
		response = new ResponseEntity<Trainee>(t, headers, HttpStatus.CREATED);
		return response;
	}

	// http://localhost:8082/updateemptrainee
	@PutMapping("/updatetrainee")
	public Trainee updateEmp(@RequestBody Trainee trainee) {
		System.out.println("Controller updateTrainee");
		return traineeservice.updateTrainee(trainee);
	}

	@GetMapping("/viewTraineeByCourseId")
	public Trainee viewTrainee(int courseId) {
		LOG.info("viewTraineeByCourseId");
		return traineeservice.viewTrainee(courseId);
	}

	@GetMapping("/viewAllTrainee")
	public List<Trainee> viewAllTrainee() 
	{
		LOG.info("viewAllTraineesByLocation");
	    return traineeservice.viewAllTrainee();
	}

		
	@DeleteMapping(path = "deleteTraineeByCourseId/{courseId}")
	public ResponseEntity<Trainee> deleteTrainee(@PathVariable(name= "courseId") int courseId) throws NoSuchRecordException 
	{
		LOG.info("deleteTraineeByCourseId");
		Trainee t = traineeservice.deleteTrainee(courseId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee deleted successfully.");
		ResponseEntity<Trainee> response = new ResponseEntity<Trainee>(t, headers, HttpStatus.OK);
		return response;
	}

	@GetMapping("/viewAllTraineesByLocation/{location}")
	public List<Trainee> viewAllTraineesByLocation(String location)
	{
		LOG.info("viewAllTraineesByLocation");
	    return traineeservice.viewAllTraineesByLocation(location);
	}

	@GetMapping("/viewbyaadharno/{aadharNo}")
	public Trainee viewTraineeByAadhar(@PathVariable long aadharNo) 
	{
		LOG.info("getTraineeByAadharNo");
		return traineeservice.viewTraineeByAadhar(aadharNo);
		
	}

}
