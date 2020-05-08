package com.web.controller;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public interface VehicleController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getVehicles();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getVehiclesbyId();

		
		
		
	}


