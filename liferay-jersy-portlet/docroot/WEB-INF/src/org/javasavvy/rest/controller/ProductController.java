package org.javasavvy.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.javasavvy.rest.modal.ProductModal;

@Path(value="/product")
public class ProductController {

	
	@GET
	@Path("/getProductDetails")
	public Response getProductDetails(){
		
		ProductModal pr = new ProductModal();
		pr.setDescription("Liferay");
		pr.setName("Liferay");
		pr.setProductId(1L);
		System.out.println("ehits ");
		return Response.status(200).entity(pr).build();
	}
}
