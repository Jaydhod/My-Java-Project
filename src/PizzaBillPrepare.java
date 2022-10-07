
public class PizzaBillPrepare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User Input
		char pizzaSize = 'L'; // possible input S, M, L

		char isExtraCheese = 'N'; // 'Y', 'N'

		char isPepperoniTopping = 'Y'; // 'Y' , 'N'

		// local variables

		int totalBill = 0;

		int pizzaPrice = 0; // 15,20,25;

		int toppingPrice = 0;

		int cheesePrice = 1;

		if (pizzaSize == ('S')) {
			pizzaPrice = 15;

			toppingPrice = 2;
		}

		else if (pizzaSize == ('M')) {

			pizzaPrice = 20;

			toppingPrice = 3;
		}

		else if (pizzaSize == ('L')) {

			pizzaPrice = 25;

			toppingPrice = 3;
		}

		else {
			System.out.println("Enter valid pizza size");

		}

		totalBill = pizzaPrice;

		if (isExtraCheese == 'Y') {
			totalBill = totalBill + cheesePrice;
		}

		if (isPepperoniTopping == 'Y') {
			totalBill = totalBill + toppingPrice;
		}

		System.out.println("Your final bill is : " + totalBill);

	}

}
