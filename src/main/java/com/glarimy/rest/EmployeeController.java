package com.glarimy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeMongoRepository employeeMongoRepository;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
	public Employee getEmployee(@RequestParam(value="name") String name) {
		Employee emp = employeeMongoRepository.findByName(name);		
		return emp;
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST, produces = "application/json")
	public Employee getEmployee(@RequestBody Employee emp ) {	
		return employeeMongoRepository.save(emp);
	}
	

}