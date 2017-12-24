/*
 * pottery-container-interface - Within-container API for testing programming exercises
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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Measurement {

  /** Placeholder string used to indicate that the measurement has not been made. */
  public static final String UNAVILABLE = "UNAVAILABLE";

  private String criterion;
  private String measurement;

  /** The unique id for this measurement so that the validator can find it. */
  private String id;

  /** Create an instance from the fields provided. */
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

  @Override
  public String toString() {
    return "Measurement{"
        + "criterion='"
        + criterion
        + '\''
        + ", measurement='"
        + measurement
        + '\''
        + ", id='"
        + id
        + '\''
        + '}';
  }
}
