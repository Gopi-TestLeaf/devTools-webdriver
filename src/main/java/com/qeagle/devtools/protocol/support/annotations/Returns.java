package com.qeagle.devtools.protocol.support.annotations;

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

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates return property.
 *
 * @author Gopinath
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {METHOD})
public @interface Returns {
  String value();
}
