package com.primrose.employees;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


public class MongoConnector {

	private static final MongoConnector INSTANCE = new MongoConnector();  // final instance of itself
	private static final String DBNAME = "primrose";  // private string for db name
	
	private MongoClient client = null;
	private MongoDatabase db = null;
	
	private MongoConnector() {
		
		// MongoClient has multiple constructors, can take no-args for default "localhost", 27017 or a string and int for defined ip and port.
		// also accepts a new MongoClientUR("mongodb://localhost:27017")
		client = new MongoClient("192.168.1.211", 27017);
		db = client.getDatabase(DBNAME);
	}
	
	public static MongoConnector getInstance() {
		return INSTANCE;
	}
	
	public MongoDatabase getMongoDatabase() {
		return db;
	}
}