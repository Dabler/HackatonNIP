package controller;


public class Resource {
	
	
	@GET
	@Path("/get/{id}")

	@Produces({"text/plain",  "text/html", "application/json"})
	public 	String getPatient(){
		
		
		return "adam" + "nowak" + "23/12/1990" + "A" + "cukrzyca";
	

	}

}
