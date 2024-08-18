package com.mybank.gatewayService.Exception;

import java.util.Date;

public class ErrorResponseDto {
	 private String status; 
	 private int statusCode;
	 private String message;
     private Date timestamp;
	public ErrorResponseDto(String status, int statusCode, String message, Date timestamp) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ErrorResponseDto [status=" + status + ", statusCode=" + statusCode + ", message=" + message
				+ ", timestamp=" + timestamp + "]";
	}
    
}
