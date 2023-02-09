package com.firstassignment.customer.service;

import com.firstassignment.customer.entitiy.Customer;
import com.firstassignment.customer.mapper.CustomerMapper;
import com.firstassignment.customer.repository.CustomerRepository;
import com.firstassignment.customer.request.CreatCustomerRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;


    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;

    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }


    public void deleteById(int id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public void add(CreatCustomerRequest creatCustomerRequest) {
        // İş işlemleri burda olucaktı mesela kullanıcı olsaydı unique olarak tanımlardık ve burda daha once kayıtlı mı diye sorgulardık.
        this.customerRepository.save(customerMapper.map(creatCustomerRequest));
    }

    @Override
    public List<CreatCustomerRequest> getInformation() {

        List<Customer> allInformations = customerRepository.findAll();
        List<CreatCustomerRequest> getInformationResult = allInformations.stream().map(customer -> customerMapper.map(customer)).collect(Collectors.toList());
        return getInformationResult;
    }

    @Override
    public void update(Customer updateCustomer) {
        System.out.println(updateCustomer.getId());
        System.out.println(updateCustomer.getName());
        this.customerRepository.save(updateCustomer);

    }




}
