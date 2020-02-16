package com.mindtree.departmentemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.departmentemployee.entity.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {

}
