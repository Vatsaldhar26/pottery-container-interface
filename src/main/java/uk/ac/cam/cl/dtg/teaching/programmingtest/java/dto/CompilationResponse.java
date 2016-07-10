/**
 * pottery-container-interface - Within-container API for testing programming
							exercises
 * Copyright © 2015 Andrew Rice (acr31@cam.ac.uk)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
