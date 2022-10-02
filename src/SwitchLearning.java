
public class SwitchLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String monthoftheyear ;
		int number = 2;
		
		
		switch(number) {
		case 1 :
			monthoftheyear = "Jan";
		break;
		case 2:
			monthoftheyear = "Feb";
		break;
		default:
			monthoftheyear = "Unknown";
			break;

		}
System.out.println(monthoftheyear);
	}

}
