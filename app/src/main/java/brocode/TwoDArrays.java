package brocode;

/**
 * TwoDArrays
 */
public class TwoDArrays {

	public static void main(String[] args) {

		String[][] cars = new String[3][4];

		cars[0][0] = "Skoda";
		cars[0][1] = "Maruti";
		cars[0][2] = "Kia";
		cars[0][3] = "Mahindra";

		cars[1][0] = "Tesla";
		cars[1][1] = "Audi";
		cars[1][2] = "Ford";
		cars[1][3] = "Honda";

		cars[2][0] = "BMW";
		cars[2][1] = "Hyundai";
		cars[2][2] = "Ferrari";
		cars[2][3] = "Rolls Royal";

		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
		}
	}
}
