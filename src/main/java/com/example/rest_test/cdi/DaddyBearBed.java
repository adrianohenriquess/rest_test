package com.example.rest_test.cdi;

@Comfort("firm")
public class DaddyBearBed implements Bed {

	@Override
	public String tryIt() {
		return "Too hard";
	}

}
