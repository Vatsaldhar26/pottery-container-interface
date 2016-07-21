package uk.ac.cam.cl.dtg.teaching.programmingtest.containerinterface;

import java.util.LinkedList;
import java.util.List;

public class HarnessResponse {

	private LinkedList<HarnessPart> testParts;
	
	private boolean completed;
	
	public HarnessResponse(LinkedList<HarnessPart> testParts, boolean completed) {
		super();
		this.testParts = testParts;
		this.completed = completed;
	}

	public HarnessResponse() {
		this.testParts = new LinkedList<>();
		this.completed = false;
	}

	public HarnessResponse(String string) {
		this.testParts = new LinkedList<>();
		this.completed = false;
	}

	public List<HarnessPart> getTestParts() {
		return testParts;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean b) {
		this.completed = b;
	}

	public void addHarnessPart(HarnessPart p) {
		this.testParts.add(p);
	}	
}
