package com.example.rest_test.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

public class HelloClient {

	WebTarget webTarget;

	public HelloClient() {
		Client client = ClientBuilder.newClient();
		webTarget = client.target("http://localhost:8080/rest_test/rest/hello");
	}

	public String getUriAsString() {
		return webTarget.getUri().toString();
	}

	public String sayHello(String message) {
		Invocation webServiceCall = webTarget.request().accept("text/plain")
												.build("PUT", Entity.text(message));
		return webServiceCall.invoke(String.class);
	}
}
