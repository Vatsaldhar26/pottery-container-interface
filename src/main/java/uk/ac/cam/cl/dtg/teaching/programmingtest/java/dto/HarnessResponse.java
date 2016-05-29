package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

import java.util.List;

public class HarnessResponse {

	private boolean success;
	private List<HarnessStep> response;
	private String failMessage;
	
	public HarnessResponse() {}
	
	public HarnessResponse(String failMessage) {
		this.success =false;
		this.failMessage = failMessage;
	}
	
	public HarnessResponse(boolean success, List<HarnessStep> response, String failMessage) {
		super();
		this.success = success;
		this.response = response;
		this.failMessage = failMessage;
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
