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
