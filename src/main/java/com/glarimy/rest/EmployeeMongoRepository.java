package com.glarimy.rest;

import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface EmployeeMongoRepository extends MongoRepository<Employee, Integer> {
    Employee findByName(String name);
}