package com.adityaadvani.testapp.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Path("/ftoc")
public class FtoC {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTemp(){
		Temp t = new Temp(32,0,"This is a demo. Get F to C conversion at /ftoc/[your F value]");
		Response re = Response.ok().entity(t).build();
		return re;
	}
	
	@Path("/{f}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFtoCTemp(@PathParam("f") double f){
		
		double c = ((f - 32.00)*(5.00/9.00));
		
		Temp t = new Temp(f,c,"F to C Converson successful!");
		Response re = Response.ok().entity(t).build();
		return re;
	}
	
	
	
	
}
