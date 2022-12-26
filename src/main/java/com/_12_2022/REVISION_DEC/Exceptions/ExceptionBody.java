package com._12_2022.REVISION_DEC.Exceptions;

import java.util.Date;

public class ExceptionBody {
	
	private Date timestamp;
	private String message;
	private String details;
	public ExceptionBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionBody(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ExceptionBody [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}
	
	

}
