package com.sachin.restws;

import java.net.URL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.sachin.restws.model.Patient;

public class PatientWSClient {

	public static void main(String[] args) {
		/*
		 * Client client = ClientBuilder.newClient(); WebTarget target = client.target(
		 * "http://localhost:8080/restws/services/patientservice/patient/1");
		 * 
		 * Builder request = target.request();
		 * 
		 * Patient response = request.get(Patient.class);
		 * 
		 * System.out.println(response.getId() + "\n" + response.getName() );
		 */
		final String PATIENT_SERVICE_URL = "http://localhost:8080/restws/services/patientservice/";
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target(PATIENT_SERVICE_URL).path("/patient/").path("/{id}").resolveTemplate("id", 3);

		Builder request = target.request();

		Patient response = request.get(Patient.class);

		System.out.println(response.getId() + "\n" + response.getName() );
	}

}
