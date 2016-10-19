package com.primrose.employees;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class WebController {



	@GET
	@Path("/doUserLogin/{userName}")
	@Produces("text/plain")
	public String showLogin(@PathParam("userName") String userName) {
		return DBConnector.getUsername(MongoConnectionManager.getInstance().getDatastore(), userName);
	}

            @GET
            @Path("/doUserPassword/{password}")
            @Produces("text/plain")
            public String showPassword(@PathParam("password") String password) {
                return DBConnector.getPassword(MongoConnectionManager.getInstance().getDatastore(), password);

            }

            @GET
            @Path("/doUserLogin/{userName}/json")
            @Produces({MediaType.APPLICATION_JSON})
            public String showLoginJSON(@PathParam("userName") String userName) {
                return DBConnector.getUsername(MongoConnectionManager.getInstance().getDatastore(), userName);
            }

            @GET
            @Path("/doUserPassword/{password}/json")
            @Produces({MediaType.APPLICATION_JSON})
            public String showPasswordJSON(@PathParam("password") String password) {
                return DBConnector.getPassword(MongoConnectionManager.getInstance().getDatastore(), password);

            }




}
