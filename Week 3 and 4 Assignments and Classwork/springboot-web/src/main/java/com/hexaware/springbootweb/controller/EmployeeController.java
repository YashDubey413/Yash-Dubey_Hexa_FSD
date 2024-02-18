package com.hexaware.springbootweb.controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootweb.dao.IEmployeeDao;
import com.hexaware.springbootweb.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	IEmployeeDao dao;
	
	@RequestMapping(value="/addEmp")
	//@ResponseBody
	public String addEmp() {
		
		
		
		return "AddEmployee";
		
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request,HttpServletResponse response) {
		
		int eid=Integer.parseInt( request.getParameter("eid"));
		String ename=request.getParameter("ename");
		double salary=Double.parseDouble(request.getParameter("salary"));
		
		Employee emp=new Employee(eid,ename,salary);
		
		return dao.addEmployee(emp);
		
	}
	
	@RequestMapping("/getall")
//	@ResponseBody
//	public List<Employee> getAllEmpployees() {
//		
//		return dao.getAll();
//		
//	}
	public String getAllEmployees(HttpSession session) {
		
		List<Employee> list=dao.getAll();
		session.setAttribute("empList", list);
		
		return "displayAll";
		
	}
	
	
	@RequestMapping("/get")
	//@ResponseBody
	public String get() {
		
		return "success";  // /views/success.jsp
	}
	
	
	@RequestMapping(value="/update")
	@ResponseBody
	public String updateEmployee(HttpServletRequest request) {
		
		int eid=Integer.parseInt( request.getParameter("eid"));
		String ename=request.getParameter("ename");
		double salary=Double.parseDouble(request.getParameter("salary"));
		
		Employee emp=new Employee(eid,ename,salary);
		
		return dao.updateEmployee(emp);
		
	}
	
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public String delete(HttpServletRequest request) {
		int eid=Integer.parseInt(request.getParameter("eid"));
		
		return dao.deleteEmployee(eid);
		
	}
	
	@RequestMapping(value="/selectOne")
	@ResponseBody
	public Employee selectOne(HttpServletRequest request) {
		int eid=Integer.parseInt(request.getParameter("eid"));
		
		return dao.getEmployeebyId(eid);
		
	}
	

}
