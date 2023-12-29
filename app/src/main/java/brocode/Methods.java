package brocode;

/**
 * Methods
 */
public class Methods {

	public static void main(String[] args) {
		String name = "Vanshaj";
		int age = 25;
		hello(name, age);
		hello(name, age);

		int x = 1;
		int y = 2;
		int result = sum(x,y);
		System.out.println("result is: " + result);
	}
	static int sum(int pam1,int pam2){
		return pam1+pam2;
	}

	static void hello(String title, int age) {
		System.out.println("Hello Hello " + title);
		System.out.println("Your age is " + age);
	}
}
