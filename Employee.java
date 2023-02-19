package com.tns.Employeeservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
	private Integer Emp_id;
	private String Emp_name;
	
	
	public Employee() 
	{
		super();
	}
	
	public Employee(Integer emp_id, String emp_name)
	{
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name)
	{
		Emp_name = emp_name;
	}
	@Override
	public String toString()
	{
		return "Employee[Employee id:"+Emp_id+" Employee name"+Emp_name+"]";
	}
}

