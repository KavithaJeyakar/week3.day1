package org.Student;

import org.Dept.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Student Name");
	}

	public void studentDept()
	{
		System.out.println("Student Dept");
	}
	
	public void studentId()
	{
		System.out.println("Student ID");
	}
	

	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		
		s.deptName();
	}
}
