package com.ashokeit.sampleCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokeit.sampleCrud.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
