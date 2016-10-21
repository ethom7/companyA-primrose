package com.primrose.employees;

import static com.mongodb.client.model.Filters.eq;


import org.bson.Document;
import org.bson.conversions.Bson;
import org.mindrot.jbcrypt.BCrypt;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;



public class DBConnector {
		
	public static boolean verifyLogin(String userName, String password) {
		
		// instantiate a mongodb from MongoConnection class
		MongoDatabase db = MongoConnector.getInstance().getMongoDatabase();
								
		// instantiate a collection 
		MongoCollection<Document> userCollection = db.getCollection("users");
				
		// verify username and password, works.
				
		Bson filter = eq("userName", userName);  //filter will only return documents with matching username 
				
		MongoCursor<Document> itr = userCollection.find(filter).iterator();
				
				
				
		try {
			while (itr.hasNext()) {
				Document cur = itr.next();
				String hashed = cur.getString("password");
				if (BCrypt.checkpw(password, hashed)) {
					return true;
				}
						
			}
		} finally {  // always use when iterating with MongoCursor
			itr.close();  // ensure the cursor is closed in all situations, incase of an exception or break in loop
		}
	
		return false;
	}

}
