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
