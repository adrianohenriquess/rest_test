package com.example.rest_test.client;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.example.rest_test.rest.JsonMessageBodyReader;
import com.example.rest_test.rest.JsonMessageBodyWriter;

public class LibraryClient {

	Client client;

	private static String WEBSERVICE_ROOT = "http://localhost:8080/LibraryService";
	private static String LIBRARY_URI = WEBSERVICE_ROOT + "/library";
	private static String BOOKS_URI = LIBRARY_URI + "/books";
	private static String GENRES_URI = LIBRARY_URI + "/genres";

	public LibraryClient() {
		this.client = ClientBuilder.newBuilder()
				.register(JsonMessageBodyReader.class)
				.register(JsonMessageBodyWriter.class)
				.build();
	}

	public String getUriAsString() {
		return LIBRARY_URI;
	}
	
	public List<JsonObject> getBooks(String genre) {
		WebTarget wt = this.client.target(BOOKS_URI + "?genre=" + genre);
		Invocation webServiceCall = wt.request().accept(MediaType.APPLICATION_JSON).build("GET");
		JsonObject invoke = webServiceCall.invoke(JsonObject.class);
		List<JsonObject> booksSummaries = new ArrayList<>();
		
		JsonArray jArray = invoke.getJsonArray("booklist");
		for (int i = 0; i < jArray.size(); i++) {
			JsonObject jsonObject = jArray.getJsonObject(i);
			booksSummaries.add(jsonObject);
		}
		return booksSummaries;
	}
}
