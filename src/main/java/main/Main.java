package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		employeeService.printEmployee();
	}
}
