package com.qeagle.devtools.protocol.events.heapprofiler;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2019 TL
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * If heap objects tracking has been started then backend regularly sends a current value for last
 * seen object id and corresponding timestamp. If the were changes in the heap since last event then
 * one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
 */
public class LastSeenObjectId {

  private Integer lastSeenObjectId;

  private Double timestamp;

  public Integer getLastSeenObjectId() {
    return lastSeenObjectId;
  }

  public void setLastSeenObjectId(Integer lastSeenObjectId) {
    this.lastSeenObjectId = lastSeenObjectId;
  }

  public Double getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }
}
