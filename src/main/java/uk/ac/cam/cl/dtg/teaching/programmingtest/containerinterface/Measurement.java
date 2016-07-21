package uk.ac.cam.cl.dtg.teaching.programmingtest.containerinterface;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Measurement {
	
	private String criterion;
	private String measurement;
	
	/**
	 * The unique id for this measurement so that the validator can find it
	 */
	private String id;

	
	@JsonCreator
	public Measurement(
			@JsonProperty("criterion") String criterion,
			@JsonProperty("measurement") String measurement,
			@JsonProperty("id") String id) {
		this.criterion = criterion;
		this.measurement = measurement;
		this.id = id;
	}

	public String getCriterion() {
		return criterion;
	}


	public String getMeasurement() {
		return measurement;
	}

	public String getId() {
		return id;
	}	
}
