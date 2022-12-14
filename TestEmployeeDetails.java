package basics.java.testif;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestEmployeeDetails {
	public static void main(String[] args) {
		
		Scanner scEmployee= new Scanner(System.in);
		Scanner scEmployee2= new Scanner(System.in);
		Scanner scEmployee3= new Scanner(System.in);
		
		
		ArrayList<EmployeeDetails> employee= new ArrayList<EmployeeDetails>();
		
		//Taking Input from user and putting into Array list through for loop
		for(int i= 1 ; i<=5 ; i++) {
		System.out.println("Enter"+ i + "Name :");
		String empName = scEmployee.nextLine();
		
		
		System.out.println("Enter" + i + "Id:");
		int empId= scEmployee2.nextInt();
		
		
		System.out.println("Enter your salary :");
		double empSalary =  scEmployee2.nextDouble();
		
		System.out.println("Enter mobile number:");
		String empMobile = scEmployee3.nextLine();
		
		EmployeeDetails emp= new EmployeeDetails(empName, empId,empSalary,empMobile );
		employee.add(emp);
		}
		
		
		Collections.sort(employee);
	// Printing employee details
		System.out.println("Employee Details :");
		for(EmployeeDetails empl : employee) {
			System.out.println(empl);
		}
		
		
		
	}

}
