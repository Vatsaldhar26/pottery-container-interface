package uk.ac.cam.cl.dtg.teaching.programmingtest.java.dto;

import java.util.List;

public class ValidationResponse {
		private List<ValidationStep> response;
		private boolean success;
		private String failMessage;
		
		public ValidationResponse() {
			super();
		}

		public ValidationResponse(String failMessage) {
			this.success = false;
			this.failMessage = failMessage;
		}
				
		public ValidationResponse(boolean success, List<ValidationStep> response, String failMessage) {
			super();
			this.response = response;
			this.success = success;
			this.failMessage = failMessage;
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