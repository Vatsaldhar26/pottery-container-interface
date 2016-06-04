package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

import java.util.List;

public class HarnessResponse {

	private boolean success;
	private List<HarnessStep> response;
	private String failMessage;
	private long executionTimeMs;
	
	public HarnessResponse() {}
	
	public HarnessResponse(String failMessage, long executionTimeMs) {
		this.success =false;
		this.failMessage = failMessage;
		this.executionTimeMs = executionTimeMs;
	}
	
	public HarnessResponse(boolean success, List<HarnessStep> response, String failMessage, long executionTimeMs) {
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
