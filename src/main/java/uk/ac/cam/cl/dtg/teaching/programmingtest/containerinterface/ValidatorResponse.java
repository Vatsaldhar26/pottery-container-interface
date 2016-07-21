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

	public ValidatorResponse() {}
	
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