package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompilationResponse {
	private boolean success;
	private String failMessage;
	private String response;
	private long executionTimeMs;

	public CompilationResponse(boolean success, String message, long executionTimeMs) {
		super();
		this.success = success;
		if (success) {
			this.response = message;
		}
		else {
			this.failMessage = message;
		}
		this.executionTimeMs = executionTimeMs;
	}
	
	@JsonCreator
	public CompilationResponse(
			@JsonProperty("success") boolean success, 
			@JsonProperty("failMessage") String failMessage, 
			@JsonProperty("response") String response, 
			@JsonProperty("executionTimeMs") long executionTimeMs) {
		super();
		this.success = success;
		this.failMessage = failMessage;
		this.response = response;
		this.executionTimeMs = executionTimeMs;
	}
	
	public long getExecutionTimeMs() {
		return executionTimeMs;
	}

	public void setExecutionTimeMs(long executionTimeMs) {
		this.executionTimeMs = executionTimeMs;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getFailMessage() {
		return failMessage;
	}
	
	public String getResponse() {
		return response;
	}
}
