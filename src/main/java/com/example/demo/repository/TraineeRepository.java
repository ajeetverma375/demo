package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Integer> 
{
	public abstract Trainee findByAadharNo(Long aadharNo);
	
	
	

	
//	@Query(value = "Select location From Trainee_Details  Where location = :location")
	//public abstract List<Trainee> getAllTraineeByLocation(@Param("location") String location);
	public abstract List<Trainee> getAllTraineeByLocation( String location);





}
