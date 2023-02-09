package com.firstassignment.customer.controller;

import com.firstassignment.customer.request.CreatCustomerRequest;
import com.firstassignment.customer.service.CustomerService;
import com.firstassignment.customer.entitiy.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Tüm Bilgileri verir
    @GetMapping("/customer")
    public List<Customer> getAll() {

        return customerService.getAll();
    }

    @DeleteMapping("/delete-id/{id}")
    public void deleteById(@PathVariable("id") int id) {


        customerService.deleteById(id);
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody CreatCustomerRequest creatCustomerRequest) {
        customerService.add(creatCustomerRequest);

    }

    // Bazı bilgileri verir Bilgileri verir.
    @GetMapping("/get-information")
    public List<CreatCustomerRequest> getInformation() {
        return customerService.getInformation();
    }

    @PatchMapping("/update-customer")
    public void update(@RequestBody Customer updateCustomer) {
        customerService.update(updateCustomer);
    }




}
