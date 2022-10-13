package ScannerJava;

public class CellphoneSelection {
	
	public String getPlans()
	{
		
	    System.out.println ("Please enter the plan you want to opt for: Rogers/Telus/Bell");
		
		String planSelection = sc.nextLine();
		
		return planSelection;
		
	}

	public String getModel(String userBrandInput)	{
		
		String modelSelection ="";
				
		if (userBrandInput.toUpperCase().equals("SAMSUNG"))
		{
		
		System.out.println("Please enter the model you want to buy from below" 
		+ "\n" +  "S22" 
		+ "\n" +  "S22+"
		+ "\n" +  "S22 Ultra"
		+ "\n" +  "S22FE");
		}
		
		else if (userBrandInput.toUpperCase().equals("APPLE"))
		{
			System.out.println("Please enter the model you want to buy from below" 
					+ "\n" +  "Iphone 14" 
					+ "\n" +  "Iphone 14 pro"
					+ "\n" +  "Iphone 14 pro max"
					+ "\n" +  "Iphone 14 mini");
		}
		
		else {
			
			System.out.println("Please enter a valid brand from given selection");
		}
		
		
		
		 		
		  
	  return modelSelection;
		
	}

	public int getPlanRates(String selectedPlan) {
		
		int planRate =0;
		
		if (selectedPlan.toUpperCase().equals("ROGERS"))
		{
			
			planRate = 70;
			
		}
		
		if (selectedPlan.toUpperCase().equals("BELL"))
		{
			
			planRate = 80;
			
		}
		
		if (selectedPlan.toUpperCase().equals("TELUS"))
		{
			
			planRate = 75;
			
		}
		return planRate;
	}
	
    public int getSamsungPhoneTabRates(String selectedModel) {
		
		int planRate =0;
		
		if (selectedModel.toUpperCase().equals("S22"))
		{
			
			planRate = 25;
			
		}
		
		if (selectedModel.toUpperCase().equals("S22+"))
		{
			
			planRate = 35;
			
		}
		
		if (selectedModel.toUpperCase().equals("S22 ULTRA"))
		{
			
			planRate = 55;
			
		}
		
		if (selectedModel.toUpperCase().equals("S22 FE"))
		{
			
			planRate = 20;
			
		}
		return planRate;
	}
	
    public int getApplePhoneTabRates(String selectedModel) {
		
		int planRate =0;
		
		if (selectedModel.toUpperCase().equals("IPHONE 14"))
		{
			
			planRate = 30;
			
		}
		
		if (selectedModel.toUpperCase().equals("IPHONE 14 PRO"))
		{
			
			planRate = 40;
			
		}
		
		if (selectedModel.toUpperCase().equals("IPHONE 14 PRO MAX"))
		{
			
			planRate = 65;
			
		}
		
		if (selectedModel.toUpperCase().equals("IPHONE 14 MINI"))
		{
			
			planRate = 25;
			
		}
		return planRate;
	}
		
 	public void finalBill(String userBrandInput, String userModelInput, String userPlanSelection)
	{
		int tabRate = 0;
		
		int planRate = 0;
		
		int monthlyAmount = 0;
 		
 		
 		CellphoneSelection cs = new CellphoneSelection();
 		
 		planRate = cs.getPlanRates(userPlanSelection);
 		
 		if (userBrandInput.toUpperCase().equals("SAMSUNG"))
		{
 			tabRate = cs.getSamsungPhoneTabRates(userModelInput);
		}
 		
 		else if (userBrandInput.toUpperCase().equals("APPLE"))
		{
 			tabRate = cs.getApplePhoneTabRates(userModelInput);
		}
 		
 		
 		monthlyAmount = tabRate + planRate;
 		
 		System.out.println("You have selected " + userModelInput + " with " + userPlanSelection + " Plan.");
 		
 		System.out.println("Your Phone Tab will be : " + "$" + tabRate);
 		
 		System.out.println("Your Monthly Plan will be : " + "$" + planRate);
 		
 		System.out.println("Total Monthly Amount : " + "$" + monthlyAmount);
 		
		
	}
	


	}





