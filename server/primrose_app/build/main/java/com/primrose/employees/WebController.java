package com.primrose.employees;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class WebController {
	
	@GET
	@Path("/doLogin/{userName}/{password}")
	@Produces("text/plain")
	public String showLogin(@PathParam("userName") String userName, @PathParam("password") String password) {
		
		if (DBConnector.verifyLogin(userName, password)) {
			return "True!";
		}
		else {
			return "False";
		}
	}
}
