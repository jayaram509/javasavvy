package org.javasavvy.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.javasavvy.rest.modal.ProductModal;
import org.javasavvy.rest.modal.StatusModal;

@Path(value="/product")
public class ProductController {

	
	@GET
	@Path("/getProductDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductDetails(){
		
		ProductModal pr = new ProductModal();
		pr.setDescription("Liferay");
		pr.setName("Liferay");
		pr.setProductId(1L);
		System.out.println("ehits ");
		return Response.status(200).entity(pr).build();
	}
	
	
	@POST
	@Path("/addProduct")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProduct(ProductModal pr){
		StatusModal st = new StatusModal();
		st.setMessage("Product Created Successfully");
		st.setStatus(200);
		return Response.status(200).entity(st).build();
	}
}
