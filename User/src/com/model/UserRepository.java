
package com.model;
import java.util.*;
public class UserRepository {
	 public static List<User>  userList= new ArrayList<User>();

	public List<User> getAllUsers() {
		return userList;
	}

	public void addUsersToRepository() {
		User user1 = new User("admin", "admin");
		User user2 = new User("Bean","Bean"); // Codefile for 154237160
		userList.add(user1);
		userList.add(user2);
	} 
}
