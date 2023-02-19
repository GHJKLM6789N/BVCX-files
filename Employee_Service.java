package com.tns.Employeeservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Employee_Service 
{
	@Autowired
	private Employee_Service_Repository repo;
	
	public List<Employee> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Employee emp)
	{
		repo.save(emp);
	}
	
	public Employee get(Integer emp_id)
	{
		return repo.findById(emp_id).get();
	}
	public void delete(Integer emp_id)
	{
		repo.deleteById(emp_id);
	}
	
}
