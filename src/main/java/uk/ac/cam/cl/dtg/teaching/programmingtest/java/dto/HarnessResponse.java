package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HarnessResponse {

	private boolean success;
	private List<HarnessStep> response;
	private String failMessage;
	private long executionTimeMs;
	
	public HarnessResponse(String failMessage, long executionTimeMs) {
		this.success =false;
		this.failMessage = failMessage;
		this.executionTimeMs = executionTimeMs;
	}
	
	@JsonCreator
	public HarnessResponse(
			@JsonProperty("success") boolean success, 
			@JsonProperty("response") List<HarnessStep> response, 
			@JsonProperty("failMessage") String failMessage, 
			@JsonProperty("executionTimeMs") long executionTimeMs) {
		super();
		this.success = success;
		this.response = response;
		this.failMessage = failMessage;
		this.executionTimeMs = executionTimeMs;
	}

	
	public long getExecutionTimeMs() {
		return executionTimeMs;
	}

	public List<HarnessStep> getResponse() {
		return response;
	}

	public String getFailMessage() {
		return failMessage;
	}

	public boolean isSuccess() {
		return success;
	}

}
