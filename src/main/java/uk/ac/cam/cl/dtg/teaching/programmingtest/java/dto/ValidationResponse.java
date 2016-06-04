package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

import java.util.List;

public class ValidationResponse {
		private List<ValidationStep> response;
		private boolean success;
		private String failMessage;
		private long executionTimeMs;
		
		public ValidationResponse() {
			super();
		}

		public ValidationResponse(String failMessage, long executionTimeMs) {
			this.success = false;
			this.failMessage = failMessage;
			this.executionTimeMs = executionTimeMs;
		}
				
		public ValidationResponse(boolean success, List<ValidationStep> response, String failMessage, long executionTimeMs) {
			super();
			this.response = response;
			this.success = success;
			this.failMessage = failMessage;
			this.executionTimeMs = executionTimeMs;
		}

		
		public long getExecutionTimeMs() {
			return executionTimeMs;
		}

		public boolean isSuccess() {
			return success;
		}

		public List<ValidationStep> getResponse() {
			return response;
		}

		public String getFailMessage() {
			return failMessage;
		}

}