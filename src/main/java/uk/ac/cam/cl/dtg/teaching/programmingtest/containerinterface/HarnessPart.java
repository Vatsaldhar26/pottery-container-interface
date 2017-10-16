/**
 * pottery-container-interface - Within-container API for testing programming exercises Copyright ©
 * 2015 Andrew Rice (acr31@cam.ac.uk)
 *
 * <p>This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Affero General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * <p>You should have received a copy of the GNU Affero General Public License along with this
 * program. If not, see <http://www.gnu.org/licenses/>.
 */
package uk.ac.cam.cl.dtg.teaching.programmingtest.containerinterface;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedList;
import java.util.List;

public class HarnessPart {

  /**
   * A list of strings giving detailed information about what the test did. What objects did it
   * create, what steps did it follow? Use &lt;code> tags to delimit code for formatting. For
   * example:
   *
   * <p>Created an array &lt;code>a&lt;/code> with 10 elements: &lt;code>1.0&lt;/code>,
   * &lt;code>4.5&lt;/code>, &lt;code>6.6&lt;/code>, &lt;code>2.1&lt;/code>, &lt;code>6.0&lt;/code>,
   * &lt;code>4.33&lt;/code>, &lt;code>10.0&lt;/code>, &lt;code>56.3&lt;/code>,
   * &lt;code>100.4&lt;/code>, &lt;code>43.4&lt;/code>. Called &lt;code>Average.mean(a)&lt;/code>
   */
  private List<String> testSteps;

  /**
   * A brief summary of the test that describes the kind of thing tested rather than the detail of
   * how it was tested. Use &lt;code> tags to delimit code for formatting.
   *
   * <p>For example:
   *
   * <p>Calculated the mean of small arrays containing values in the range of 0 to 1000
   *
   * <p>Or:
   *
   * <p>Calculated the mean of small arrays containing a mixture of very small and very large values
   */
  private String testSummary;

  private List<Measurement> measurements;

  /** If non-null then an error occurred and this is a short summary */
  private String errorSummary;

  /**
   * If non-null then an error occurred and this is a detailed breakdown of the error. Use &lt;code>
   * tags to delimit code, and
   *
   * <ul>
   *   ,
   *   <li>for listing elements (e.g. stack trace)
   */
  private String errorDetail;

  @JsonCreator
  public HarnessPart(
      @JsonProperty("testSummary") String testSummary,
      @JsonProperty("testSteps") List<String> testSteps,
      @JsonProperty("measurements") List<Measurement> measurements,
      @JsonProperty("errorSummary") String errorSummary,
      @JsonProperty("errorDetail") String errorDetail) {
    super();
    this.testSummary = testSummary;
    this.testSteps = testSteps;
    this.measurements = measurements;
    this.errorSummary = errorSummary;
    this.errorDetail = errorDetail;
  }

  public HarnessPart() {
    super();
    this.testSteps = new LinkedList<>();
    this.measurements = new LinkedList<>();
  }

  public void addStep(String step) {
    this.testSteps.add(step);
  }

  public void addMeasurement(String criterion, Object measurement, String id) {
    this.measurements.add(new Measurement(criterion, "" + measurement, id));
  }

  public void setTestSummary(String testSummary) {
    this.testSummary = testSummary;
  }

  public List<String> getTestSteps() {
    return testSteps;
  }

  public String getTestSummary() {
    return testSummary;
  }

  public List<Measurement> getMeasurements() {
    return measurements;
  }

  public String getErrorSummary() {
    return errorSummary;
  }

  public void setErrorSummary(String errorSummary) {
    this.errorSummary = errorSummary;
  }

  public String getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }
}
