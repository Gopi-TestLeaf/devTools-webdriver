package com.qeagle.devtools.protocol.definition.types.type.object.properties;

/*-
 * #%L
 * cdt-java-protocol-builder
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.qeagle.devtools.protocol.definition.types.type.object.Property;
import lombok.Getter;
import lombok.Setter;

/**
 * Ref property.
 *
 * @author Gopinath
 */
@Getter
@Setter
@JsonDeserialize(using = JsonDeserializer.None.class)
public class RefProperty extends Property {
  @JsonProperty("$ref")
  private String ref;
}
