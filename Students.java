package org.Student;

public class Students {
	
	public void getStudentInfo(int studentId)
	
	{
		System.out.println("StudentId : " + studentId);
	}
	
	public void getStudentInfo(int studentId,String Name)
	
	{
		System.out.println( "StudentId : " + studentId + " Name : " + Name );
	}
	
	public void getStudentInfo(String email,Long phoneno)

	{
		System.out.println( "Email : " + email + " Phone no : " + phoneno);
	
	}

	public static void main(String[] args) {
		
		Students s = new Students();
		
		s.getStudentInfo(1021);
		s.getStudentInfo(1021, "Kavitha");
		s.getStudentInfo("joskavitha@gmail.com",9962341892l);
	}
	

}

