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

import java.util.LinkedList;
import java.util.List;

public class HarnessResponse {

  private LinkedList<HarnessPart> testParts;

  private boolean completed;

  private String errorMessage;

  /** Create a new instance from the fields provided. */
  public HarnessResponse(LinkedList<HarnessPart> testParts, boolean completed) {
    super();
    this.testParts = testParts;
    this.completed = completed;
  }

  /** Create an instance marked incomplete with an empty list of test parts. */
  public HarnessResponse() {
    this.testParts = new LinkedList<>();
    this.completed = false;
  }

  /**
   * Create an instance marked incomplete with an empty list of test parts and the given error
   * message.
   */
  public HarnessResponse(String errorMessage) {
    this.testParts = new LinkedList<>();
    this.completed = false;
    this.errorMessage = errorMessage;
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

  public String getErrorMessage() {
    return errorMessage;
  }

  @Override
  public String toString() {
    return "HarnessResponse{"
        + "testParts="
        + testParts
        + ", completed="
        + completed
        + ", errorMessage='"
        + errorMessage
        + '\''
        + '}';
  }
}
