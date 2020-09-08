package com.qeagle.devtools.services.factory;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 TL
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

import com.qeagle.devtools.services.WebSocketService;
import com.qeagle.devtools.services.exceptions.WebSocketServiceException;

/**
 * Web service socket factory.
 *
 * @author Gopinath
 */
@FunctionalInterface
public interface WebSocketServiceFactory {
  /**
   * Creates a web socket service given a web socket url.
   *
   * @param wsUrl Web socket url.
   * @return Web socket service.
   */
  WebSocketService createWebSocketService(String wsUrl) throws WebSocketServiceException;
}
