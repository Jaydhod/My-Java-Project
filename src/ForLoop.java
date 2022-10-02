
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int actualCapacity = 3;
		

		for (int counter = 1; counter <= 5; counter++) {
			System.out.println("Number of drinks " + counter + " times");
			if (actualCapacity == counter) {
				System.out.println("Max. Limit is reached And No More Drinks");
				break;
			}
		}

	}

}
