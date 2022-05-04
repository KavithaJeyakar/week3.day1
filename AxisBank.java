package week3.day1;

public class AxisBank extends Bank{
	
	public void deposit()
	{
		System.out.println("Deposit Account interest rate changed in AXIS bank");
	}

	
	public static void main(String[] args) {
		
		AxisBank A = new AxisBank();
		A.deposit();
	}
}
