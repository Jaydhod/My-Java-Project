
public class FillChocolateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int addChoco = 5;
		
		int maxChocoInBox = 63;
		
		int chocoInBox = 27;
		
	System.out.println("Total chocolates in box :"  + chocoInBox);
		
	while (chocoInBox <= maxChocoInBox)
	{
		
		if (chocoInBox + addChoco <= maxChocoInBox)
		
       {
		
		chocoInBox = chocoInBox + addChoco;
			
     	System.out.println("Total chocolates in box :"  + chocoInBox);
	
       }	
		
		
	}


	}

}
