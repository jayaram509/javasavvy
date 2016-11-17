package org.javasavvy.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.javasavvy.rest.modal.StatusModal;
import org.javasavvy.rest.modal.UserModal;

import com.liferay.portal.kernel.json.JSONFactoryUtil;

@Path(value = "/user")
public class UserController {

	@POST
	@Path("/create-user")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(UserModal userObj){
		
		StatusModal st = new StatusModal();
		st.setMessage("User Created Successfully");
		st.setStatus(200);
		return Response.status(200).entity(st).build();
	}

	@POST
	@Path("/update-user")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateUser(UserModal userJSON) {
		
		System.out.println("User  called with Data: \n "+JSONFactoryUtil.serialize(userJSON));	
		StatusModal st = new StatusModal();
		st.setMessage("User update Successfully");
		st.setStatus(200);
		return Response.status(200).entity(st).build();
	}
	
	@POST
	@Path("/delete-user")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteUser(UserModal userJSOn){
		StatusModal st = new StatusModal();
		st.setMessage("User deleted Successfully");
		st.setStatus(200);
		return Response.status(Status.OK.getStatusCode()).entity(st).build();
	}
}
