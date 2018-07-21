package com.example.rest_test.cdi;

@Comfort("yelding")
public class MommyBearBed implements Bed {

	@Override
	public String tryIt() {
		return "Too soft";
	}

}
