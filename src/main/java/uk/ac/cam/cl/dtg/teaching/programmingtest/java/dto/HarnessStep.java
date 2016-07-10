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

public class HarnessStep {

	public static final String TYPE_MESSAGE = "MESSAGE";
	public static final String TYPE_MEASUREMENT = "MEASUREMENT";
	public static final String TYPE_STATE = "STATE";
	
	public static final String MESSAGE_COMPLETED = "Completed";
	
	private String type;
	private String message;
	private Object actual;
	private String id;
	
	
	@JsonCreator
	public HarnessStep(
			@JsonProperty("type") String type, 
			@JsonProperty("messsage") String message,
			@JsonProperty("actual") Object actual, 
			@JsonProperty("id") String id) {
		super();
		this.type = type;
		this.message = message;
		this.actual = actual;
		this.id = id;
	}

	public static HarnessStep newMessage(String message) {
		return new HarnessStep(TYPE_MESSAGE,message,null,null);
	}
	
	public static HarnessStep newMeasurement(String id, String message, Object actual) {
		return new HarnessStep(TYPE_MEASUREMENT,message,actual,id);
	}
	
	public static HarnessStep newState(String message, Object actual) {
		return new HarnessStep(TYPE_STATE,message,actual,null);
	}

	public String getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}

	public Object getActual() {
		return actual;
	}

	public String getId() {
		return id;
	}
		
}