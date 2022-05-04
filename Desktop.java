package org.System;

public class Desktop extends Computer {
	
	public void DesktopSize ()
	{
		System.out.println("Desktop Size");
	}	
	
	public static void main(String[] args) {
		
		Desktop D = new Desktop();
		
		D.DesktopSize();
		D.ComputerModel();
		
		
	}

}
