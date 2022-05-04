package LearnInterface;

public class Automation implements Language,TestTool {

	
	public void Java1() 
	{
		this.Selenium();;
		System.out.println("Java is a Obj Oriented Programming Language");
	}
	
	public void Selenium() 
	{
		System.out.println("Selenium is a Testing tool for Automation");
	} 
	

	public static void main(String[] args) {

		
	Automation A  = new Automation();
	
	A.Java1();
	A.Selenium();
	
	}
	
}
