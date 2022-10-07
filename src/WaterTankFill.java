
public class WaterTankFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int waterTankCapMax = 100;

		int bucketCap = 10;

		int bucketFilledUpto = 10;

		do {

			System.out.println("Water Tank is filled up to : " + bucketFilledUpto + " Litres");
			bucketFilledUpto = bucketFilledUpto + bucketCap;
		}

		while (bucketFilledUpto <= waterTankCapMax);

		System.out.println("Water Tank is filled to it's capacity");

	}

}
