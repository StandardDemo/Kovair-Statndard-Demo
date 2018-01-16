
package com.model;
import java.util.*;
public class UserRepository {
	 public static List<User>  userList= new ArrayList<User>();

	public List<User> getAllUsers() {
		return userList;
	}

	public void addUsersToRepository() {
		User user1 = new User("admin", "admin");
		User user2 = new User("Bean","Bean");
		User user3 = new User("Tim","Tim");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
	} 
}
