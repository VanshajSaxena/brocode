package brocode;

/**
 * OverlodedMethods
 */
public class OverlodedMethods {

	public static void main(String[] args) {
		add(3, 4);
		add(3, 4, 5);
		add(3, 4, 5, 6);
		add(3.0, 4.0);
		add(3.1, 4.7, 5.3);
		add(3.34, 4.24, 5.24, 6.632);
	}

	static int add(int a, int b) {
		System.out.println("This is overloded method nu. 1");
		int res = a + b;
		System.out.println(res);
		return res;
	}

	static int add(int a, int b, int c) {
		System.out.println("This is overloded method nu. 2");
		int res = a + b + c;
		System.out.println(res);
		return res;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloded method nu. 3");
		int res = a + b + c + d;
		System.out.println(res);
		return res;
	}

	static double add(double a, double b) {
		System.out.println("This is overloded method nu. 4");
		double res = a + b;
		System.out.println(res);
		return res;
	}

	static double add(double a, double b, double c) {
		System.out.println("This is overloded method nu. 5");
		double res = a + b + c;
		System.out.println(res);
		return res;
	}

	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloded method nu. 6");
		double res = a + b + c + d;
		System.out.println(res);
		return res;
	}
}
