package brocode;

import brocode.OOP.Friends;

/**
 * StaticKeyword
 */
public class StaticKeyword {

	public static void main(String[] args) {
		
		//Friends friend1 = new Friends("Dhairya");
		//Friends friend2 = new Friends("Deepak");
		//Friends friend3 = new Friends("Vikash");
		//Friends friend4 = new Friends("Siraj");

		System.out.println(Friends.numberOfFriends);
		Friends.displayFriends();
	}
}
