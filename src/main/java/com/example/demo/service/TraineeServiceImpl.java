package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NoSuchRecordException;
import com.example.demo.exception.TraineeNotFoundException;
import com.example.demo.model.Trainee;
import com.example.demo.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements ITraineeService
{ 
	private static final Logger LOG = LoggerFactory.getLogger(TraineeServiceImpl.class);
	
	 @Autowired
	 private TraineeRepository traineeRepository;
	 
	 public List<Trainee> getAllTrainees()
	 {
			System.out.println("Service getAllTrainees");
			return traineeRepository.findAll();
	}
   	 
	@Override
	public Trainee addTrainee(Trainee course)  
	{
		LOG.info("Service addEmployee");
		if (!traineeRepository.existsById(course.getTraineeId()))
			return traineeRepository.save(course);
		else
			throw new TraineeNotFoundException(course.getTraineeId() + "already exists ");
	}
	
	@Override
	@Transactional
	public Trainee updateTrainee(Trainee course) {
		System.out.println("Trainee Update");
		if (traineeRepository.existsById(course.getTraineeId()))
			return traineeRepository.save(course);
		System.out.println(course.getTraineeId() + " does not exist.");
		return null;
		
	}

	@Override
	public Trainee viewTrainee(int courseId)
	{
		System.out.println("View Trainee By CoursId");
		
         
		return null;
	}

	@Override
	public List<Trainee> viewAllTrainee() {
		List<Trainee> list=traineeRepository.findAll();
		if(!list.isEmpty())
		{
			LOG.info("viewalltrainee");
			return list;
		}
		LOG.error("No Trainee Present");
		throw new NoSuchRecordException("No Trainee Present");
	}

	@Override
	public Trainee deleteTrainee(int courseId) {
		
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Trainee> viewAllTraineesByLocation(String location) {
		List<Trainee> list= traineeRepository.getAllTraineeByLocation(location);
		if(!list.isEmpty())
		{
			LOG.info("viewAllTraineesByLocation");
			return list;
		}
		LOG.error("No Trainee in this location");
		throw new NoSuchRecordException("No Trainee in this location");
	}

	@Override
	public Trainee viewTraineeByAadhar(long aadharNo) {
		Trainee trainee=traineeRepository.findByAadharNo(aadharNo);
		if(trainee!=null)
		{
			LOG.info("viewTraineeByAadhar");
			return trainee;
		}
		LOG.error("Aadhar Number Does Not Exists");
		throw new NoSuchRecordException("Aadhar Number Does Not Exists");
	}

	
}
