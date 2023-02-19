package com.tns.Employeeservice;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_service_Controller
{
	@Autowired(required=true)
	private Employee_Service service;
	
	@GetMapping("/employeeservice")
	public java.util.List<Employee> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/employeeservice/{emp_id}")
	public ResponseEntity<Employee> get(@PathVariable Integer emp_id)
	{
		try
		{
			Employee emp=service.get(emp_id);
			return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/employeeservice")
	public void add(@RequestBody Employee emp)
	{
		service.save(emp);
	}
	
	@PutMapping("/employeeservice/{emp_id}")
	public ResponseEntity<?> update(@RequestBody Employee emp, @PathVariable Integer Emp_id)
	{
		Employee existemp=service.get(Emp_id);
		service.save(existemp);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/employeeservice/{emp_id}")
	public void delete(@PathVariable Integer emp_id)
	{
		service.delete(emp_id);
	}
}
