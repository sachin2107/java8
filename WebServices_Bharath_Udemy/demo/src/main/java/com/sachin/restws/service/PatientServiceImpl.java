package com.sachin.restws.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.sachin.restws.exceptions.PatientBusinessException;
import com.sachin.restws.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	public Map<Integer, Patient> patients = new HashMap();
	int currentId = 1;
	
	PatientServiceImpl () {
		init();
	}

	private void init() {
		Patient patient = new Patient();
		patient.setId(currentId);
		patient.setName("sachin");
		patients.put(patient.getId(), patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		Collection<Patient> results = patients.values();
		List<Patient> response = new ArrayList<Patient>(results);
		return response;
	}

	@Override
	public Patient getPatient(int id) {
		if ( patients.get(id) == null ) {
//			throw new WebApplicationException(Response.Status.NOT_FOUND);
			throw new PatientBusinessException();
		}
		return patients.get(id);
	}

	@Override
	public Response createPatient(Patient patient) {
		patient.setId(++currentId);
		patients.put(patient.getId(), patient);
		return Response.ok(patient).build();
	}

	@Override
	public Response updatePatient(Patient patient) {
		Patient currentPatient =patients.get(patient.getId()) ; 
		Response response;
		if ( currentPatient != null) {
			patients.put(patient.getId(), patient);
			response = Response.ok().build();
		}else {
			response = Response.notModified().build();
		}
		return response;
	}

	@Override
	public Response deletePatient(int id) {
		Patient currentPatient =patients.get(id) ; 
		Response response;
		if ( currentPatient != null) {
			patients.remove(id);
			response = Response.ok().build();
		}else {
			response = Response.notModified().build();
		}
		return response;
	}

	@Override
	public List<Patient> getAllPatients(int start, int end) {
		Collection<Patient> results = patients.values();
		List<Patient> response = new ArrayList<Patient>(results);
		
		if( start >=0 && end>start && response.size()>end ) {
			response = response.subList(start-1, end);
		}
		return response;
	}
}
