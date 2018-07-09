package com.example.rest_test.rest;

import javax.ws.rs.GET;

public class GreetingResource {
	
	@GET
	public String getGreeting() {
		return "Hail fellow well met!";
	}
}
