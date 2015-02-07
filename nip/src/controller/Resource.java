package controller;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




import model.Patient;


public class Resource {
	
	PatientManagement patients = new PatientManagement("patients");
	
	@GET
	@Path("/get/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String getPatient(int id)
	{
		Patient p = patients.getPatientByDevice(id);
		String info = "firstname: " + p.getFirstname() +
				" lastname: " + p.getLastname() +
				" birthday: " + p.getBirthday() +
				" vaccines: " + p.getVaccines().toString() +
				" diseases: " + p.getDiseases().toString() +
				" allergies: " + p.getAllergies().toString() +
				" pesel: " + p.getPesel() +
				" blood type: " + p.getBloodType() +
				" ICE number: " + p.getIceNumber() + 
				" adress: " + p.getAddress();
		return info;
	}
}
