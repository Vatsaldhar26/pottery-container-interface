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