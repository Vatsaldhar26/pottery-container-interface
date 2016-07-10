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

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidationStep {
	
	private String criterion;
	private String result;
	private boolean acceptable;
	private List<String> references;
	
	public static ValidationStep newInstance(String criterion, String result, boolean acceptable, String... references) {
		return new ValidationStep(criterion,result,acceptable,Arrays.asList(references));
	}
	
	@JsonCreator
	public ValidationStep(
			@JsonProperty("criterion") String criterion, 
			@JsonProperty("result") String result, 
			@JsonProperty("acceptable") boolean acceptable, 
			@JsonProperty("references") List<String> references) {
		super();
		this.criterion = criterion;
		this.result = result;
		this.acceptable = acceptable;
		this.references = references;
	}
	
	public boolean isAcceptable() {
		return acceptable;
	}

	public String getCriterion() {
		return criterion;
	}

	public String getResult() {
		return result;
	}

	public List<String> getReferences() {
		return references;
	}	
}
