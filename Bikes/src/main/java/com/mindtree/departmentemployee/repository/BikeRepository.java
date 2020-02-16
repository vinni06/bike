package com.mindtree.departmentemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.departmentemployee.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {
	
	

}
