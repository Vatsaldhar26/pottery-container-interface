package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

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

	public CompilationResponse() {
		super();
	}
	
	
	
	public CompilationResponse(boolean success, String failMessage, String response, long executionTimeMs) {
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
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getFailMessage() {
		return failMessage;
	}
	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}	
	
}
