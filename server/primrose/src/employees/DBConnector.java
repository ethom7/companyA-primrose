package com.primrose.employees;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.junit.Assert;


public class DBConnector {


	public static String getUsername(Datastore datastore, String user) {
		Query<User> query = datastore.createQuery(User.class);
		List<User> users = datastore.createQuery(User.class)
						.filter("userName ==", user)
						.asList();

		for (User us : users) {
			if (us.getUserName().equals(user)) {
				return "Yes";
			}
		}

		return "No";

	}

	public static String getPassword(Datastore datastore, String password) {

		Query<User> query = datastore.createQuery(User.class);
		List<User> users = datastore.createQuery(User.class)
						.filter("password ==", password)
						.asList();


		if (users.size() > 1 ) {
			return "Yes";
		}
		else {
			return "No";
		}


	}



}
