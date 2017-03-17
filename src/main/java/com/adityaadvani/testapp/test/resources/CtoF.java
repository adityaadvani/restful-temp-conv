package com.adityaadvani.testapp.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Path("/ctof")
public class CtoF {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTemp(){
		Temp t = new Temp(32,0,"This is a demo. Get C to F conversion at /ctof/[your C value]");
		Response re = Response.ok().entity(t).build();
		return re;
	}
	
	@Path("/{c}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFtoCTemp(@PathParam("c") double c){
		
		double f = ((c*(9.00/5.00)) + 32.00);
		
		Temp t = new Temp(f,c,"C to F Converson successful!");
		Response re = Response.ok().entity(t).build();
		return re;
	}
	
	
	
	
}