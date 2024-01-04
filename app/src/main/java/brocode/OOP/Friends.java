package brocode.OOP;

/**
 * Friends
 * static keyword
 */
public class Friends {

	String name;
	public static int numberOfFriends;

	public static void displayFriends() {
		System.out.println("The number of friends that you have are: " + numberOfFriends);
	}

	public Friends(String name) {
		this.name = name;
		numberOfFriends++;
	}

}
