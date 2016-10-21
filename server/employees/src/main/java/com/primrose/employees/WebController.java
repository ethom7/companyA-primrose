package com.primrose.employees;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class WebController {
	
	@GET
	@Path("/doUserLogin/{userName}")
	@Produces("text/plain")
	public String showLogin(@PathParam("userName") String userName) {
		return DBConnector.getUsername(MongoConnectionManager.getInstance().getDatastore(), userName);
	}
}
