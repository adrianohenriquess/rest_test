package com.example.rest_test.websockectcdi.observer;

import java.util.ArrayList;
import java.util.List;

abstract class StructuredMessage extends ChatMessage {
	
	protected List<String> dataList = new ArrayList<>();

	protected StructuredMessage(String type) {
		super(type);
	}
	
	protected StructuredMessage(String type, List<String> dataList) {
		super(type);
		this.dataList = dataList;
	}
	
	List<String> getList() {
		return dataList;
	}

}
