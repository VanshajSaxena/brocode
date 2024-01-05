package brocode;

/**
 * A
 * 
 */
public class A {

	protected String protectedMessage = "This is the protected message.";
	private String privateMessage = "This is the private message.";

	public static void main(String[] args) {

		A a = new A();

		System.out.println(a.privateMessage);

	}

}
