
public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		int j = 5;
		
		int result = 0;
		
		char Operator = '/' ;
		
		
		switch(Operator) {
		
		case '+' :
			
			result = i+j;
			break;
			
		case '-' :
			
			result = i-j;
			break;
			
		case '*' :
			
			result = i*j;
			break;
			
		case '/' :
			result = i/j;
			break;
			
		default :
			
			System.out.println("Please provide valid input.");
			break;
		
		}
		
		System.out.println( i + " " + Operator + " " + j + " = " + result);
		
	}



	}


