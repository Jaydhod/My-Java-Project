package ScannerJava;

import java.util.Scanner;

public class Cellphone{


	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println ("Please enter the brand you want to choose from: Apple/Samsung");
		
		String brandSelection = "";
	 	
	    String modelSelection = "";	
	    
	    String planSelection = "";	
	    
		brandSelection = sc.next();
		
		CellphoneSelection cs = new CellphoneSelection();
	
		modelSelection = cs.getModel(brandSelection);	
			
		planSelection = cs.getPlans();
		
		cs.finalBill(brandSelection,modelSelection,planSelection);
	
		
	}
}
	