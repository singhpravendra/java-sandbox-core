package com.rest;

import javax.activation.DataHandler;

public class FileDownLoadResponse {
	public String status;
	public String data;
	public DataHandler binaryData;

	public FileDownLoadResponse() {
		
	}

	public FileDownLoadResponse(String status, String data,
			DataHandler binaryData) {
		super();
		this.status = status;
		this.data = data;
		this.binaryData = binaryData;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DataHandler getBinaryData() {
		return binaryData;
	}

	public void setBinaryData(DataHandler binaryData) {
		this.binaryData = binaryData;
	}
	
	
}