package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidationResponse {
		private List<ValidationStep> response;
		private boolean success;
		private String failMessage;
		private long executionTimeMs;
		
		public ValidationResponse(String failMessage, long executionTimeMs) {
			this.success = false;
			this.failMessage = failMessage;
			this.executionTimeMs = executionTimeMs;
		}
		
		@JsonCreator
		public ValidationResponse(
				@JsonProperty("success") boolean success, 
				@JsonProperty("response") List<ValidationStep> response, 
				@JsonProperty("failMessage") String failMessage, 
				@JsonProperty("executionTimeMs") long executionTimeMs) {
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