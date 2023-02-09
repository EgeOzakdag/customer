package com.firstassignment.customer.service;


import com.firstassignment.customer.request.CreatCustomerRequest;
import com.firstassignment.customer.entitiy.Customer;

import java.util.List;

public interface CustomerService  {


    public List<Customer> getAll();

    public void deleteById(int id);

    public void add(CreatCustomerRequest creatCustomerRequest);

    public List<CreatCustomerRequest> getInformation();

    public void update(Customer newCustomer);


}
