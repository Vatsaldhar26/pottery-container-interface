package uk.ac.cam.cl.dtg.teaching.programmingtest.containerinterface;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Interpretation {

	public static final String INTERPRETED_GOOD="good";
	public static final String INTERPRETED_ACCEPTABLE="acceptable";
	public static final String INTERPRETED_BAD="bad";

	private String id;
	
	private String result;
	
	private String explanation;

	@JsonCreator
	public Interpretation(
			@JsonProperty("id") String id, 
			@JsonProperty("result") String result,
			@JsonProperty("explanation") String explanation) {
		super();
		this.id = id;
		this.result = result;
		this.explanation = explanation;
	}

	public String getId() {
		return id;
	}

	public String getResult() {
		return result;
	}

	public String getExplanation() {
		return explanation;
	}
	
	
}
