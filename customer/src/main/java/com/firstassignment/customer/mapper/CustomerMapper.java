package com.firstassignment.customer.mapper;


import com.firstassignment.customer.entitiy.Customer;
import com.firstassignment.customer.request.CreatCustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel="spring")
public interface CustomerMapper {

    @Mapping(target = "name",source = "name")
    @Mapping(target = "lastName",source = "surname")
    @Mapping(target = "city",source = "address")
    @Mapping(target = "note",source = "note")
    CreatCustomerRequest map(Customer customer);

    @Mapping(target = "name",source = "name")
    @Mapping(target = "surname",source = "lastName")
    @Mapping(target = "address",source = "city")
    @Mapping(target = "note",source = "note")
    Customer map(CreatCustomerRequest creatCustomerRequestomer);



}
