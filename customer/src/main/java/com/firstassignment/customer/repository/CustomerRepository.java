package com.firstassignment.customer.repository;

import com.firstassignment.customer.entitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
