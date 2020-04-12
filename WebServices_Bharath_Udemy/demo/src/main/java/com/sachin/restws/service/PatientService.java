package com.sachin.restws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.sachin.restws.model.Patient;

@Produces("application/xml,application/json")
@Consumes("application/xml,application/json")
@Path("/patientservice")
public interface PatientService {

	@Path("/patients")
	@GET
	public List<Patient> getAllPatients();
	
	@Path("/patient/{id1}")
	@GET
	public Patient getPatient(@PathParam(value="id1") int id);
	
	@Path("/patient")
	@POST
	public Response createPatient (Patient patient);
	
	@Path("/patient")
	@PUT
	public Response updatePatient(Patient patient);
	
	@Path("/patient/{id}")
	@DELETE
	public Response deletePatient(@PathParam(value="id") int id);
	
	@Path("/patientsqueryparam")
	@GET
	public List<Patient> getAllPatients(@QueryParam("startSize")int start, @QueryParam("pageSize")int end);
}
