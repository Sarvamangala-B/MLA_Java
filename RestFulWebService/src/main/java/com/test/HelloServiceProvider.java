package com.test;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloServiceProvider {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String SimplePlainTextResponse() {
		return "This is simple RestFulweb Service Plain text Response";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/html/{debit}")
	public String htmlTextResponse(@PathParam("debit") String card) {
		return "<html><body><h1> Simple RestAPI HTML Response card no::" +card+ "</h1> </body></html>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg") String msg ) {
		return msg;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<UserDetails> listAllUserData(){
		UserDetails u1 = new UserDetails(1,"abc","bca","abc@gmail.com",123456789);
		UserDetails u2 = new UserDetails(2,"aaa","bbb","xxx@gmail.com",1352747);
		UserDetails u3 = new UserDetails(3,"mmm","ccc","mmm@gmail.com",143903726);
		return List.of(u1,u2,u3);
	}
}
