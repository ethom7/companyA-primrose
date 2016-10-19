package com.primrose.employees;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoConnectionManager {


	private static final MongoConnectionManager INSTANCE = new MongoConnectionManager();
	private static final String DB_NAME = "primrose";

	private Morphia morphia = null;
	private Datastore datastore = null;
	private MongoClient mongoClient = null;

	private MongoConnectionManager() {
		morphia = new Morphia();

		datastore = morphia.createDatastore(new MongoClient("localhost", 27017), DB_NAME);
	}

	public static MongoConnectionManager getInstance() {
		return INSTANCE;
	}

	public Morphia getMorphia() {
		return morphia;
	}

	public void setMorphia(Morphia morphia) {
		this.morphia = morphia;
	}

	public Datastore getDatastore() {
		return datastore;
	}

	public void setDatastore(Datastore datastore) {
		this.datastore = datastore;
	}

	public MongoClient getMongoClient() {
		return mongoClient;
	}

	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}
}
