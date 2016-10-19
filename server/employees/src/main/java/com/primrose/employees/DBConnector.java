package com.primrose.employees;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

public class DBConnector {
	
		
	public static String getUsername(Datastore datastore, String user) {
		Query<User> query = datastore.createQuery(User.class);
		List<User> users = datastore.createQuery(User.class)
											.filter("userName ==", user)
											.asList();
		if (users.size() == 1) {
			return "Yes";
		}
		else {
			return "No";
		}
	
	}

}
