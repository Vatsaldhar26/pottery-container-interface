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
package uk.ac.cam.cl.dtg.teaching.programmingtest.containerinterface;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidatorResponse {

	private boolean completed;
	
	private String overallInterpretation;
	
	private List<Interpretation> interpretations;
	
	private String message;

	@JsonCreator
	public ValidatorResponse(
			@JsonProperty("completed") boolean completed, 
			@JsonProperty("overallInterpretation") String overallInterpretation, 
			@JsonProperty("interpretations") List<Interpretation> interpretations,
			@JsonProperty("message") String message) {
		super();
		this.completed = completed;
		this.overallInterpretation = overallInterpretation;
		this.interpretations = interpretations;
		this.message = message;
	}

	public ValidatorResponse() {
		this.interpretations = new LinkedList<>();		
	}
	
	public ValidatorResponse(String string) {
		this.completed = false;
		this.overallInterpretation = Interpretation.INTERPRETED_BAD;
		this.interpretations = new LinkedList<>();
		this.message = string;
	}
	
	public boolean isCompleted() {
		return completed;
	}

	public String getOverallInterpretation() {
		return overallInterpretation;
	}

	public List<Interpretation> getInterpretations() {
		return interpretations;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setCompleted(boolean b) {
		this.completed = b;
	}	
}