
public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		int num = 13;
		int i = 2;   
		int count = 0;
		
		if (num < i)
		{
			count =1;
		}
		
		
		while(i<num)
		{
			if (num%i ==0)
			{
				count++;
				break;
			}
			i++;
		}
		
		if (count ==0)
			System.out.println(num + " is a Prime number");
		else 
			System.out.println(num + " is not a Prime number");
		
	}



	}




	


