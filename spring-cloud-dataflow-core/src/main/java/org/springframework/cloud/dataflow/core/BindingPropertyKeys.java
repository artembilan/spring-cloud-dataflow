/*
 * Copyright 2015-2016 the original author or authors.
 *
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
 */

package org.springframework.cloud.dataflow.core;

/**
 * Spring Cloud Stream property keys used for binding.
 *
 * @author Ilayaperumal Gopinathan
 * @author Marius Bogoevici
 * @author Mark Fisher
 */
public class BindingPropertyKeys {
	
	private static final String ROOT_PREFIX = StreamPropertyKeys.PREFIX;

	private static final String BINDING_KEY_PREFIX = ROOT_PREFIX + "bindings.";

	/**
	 * Prefix used in property keys for input binding.
	 */
	public static final String INPUT_BINDING_KEY_PREFIX = BINDING_KEY_PREFIX + "input.";

	/**
	 * Prefix used in property keys for output binding.
	 */
	public static final String OUTPUT_BINDING_KEY_PREFIX = BINDING_KEY_PREFIX + "output.";

	/**
	 * Destination property key for input binding.
	 */
	public static final String INPUT_DESTINATION = INPUT_BINDING_KEY_PREFIX + "destination";

	/**
	 * Destination property key for output binding.
	 */
	public static final String OUTPUT_DESTINATION = OUTPUT_BINDING_KEY_PREFIX + "destination";

	private static final String CONTENT_TYPE = "contentType";

	/**
	 * Content Type property key for input binding.
	 */
	public static final String INPUT_CONTENT_TYPE = INPUT_BINDING_KEY_PREFIX + CONTENT_TYPE;

	/**
	 * Content Type property key for output binding.
	 */
	public static final String OUTPUT_CONTENT_TYPE = OUTPUT_BINDING_KEY_PREFIX + CONTENT_TYPE;

	/**
	 * Group property key for input binding.
	 */
	public static final String INPUT_GROUP = INPUT_BINDING_KEY_PREFIX + "group";

	/**
	 * Durable Subscription property key for input binding.
	 */
	public static final String INPUT_DURABLE_SUBSCRIPTION = INPUT_BINDING_KEY_PREFIX + "durableSubscription";

	/**
	 * Partition Key Expression property key for output binding.
	 */
	public static final String OUTPUT_PARTITION_KEY_EXPRESSION = OUTPUT_BINDING_KEY_PREFIX + "partitionKeyExpression";

	/**
	 * Partition Key Extractor Class property key for output binding.
	 */
	public static final String OUTPUT_PARTITION_KEY_EXTRACTOR_CLASS = OUTPUT_BINDING_KEY_PREFIX + "partitionKeyExtractorClass";

	/**
	 * Partitioned property key for input binding.
	 */
	public static final String INPUT_PARTITIONED = INPUT_BINDING_KEY_PREFIX + "partitioned";

	/**
	 * Partition Count property key for output binding.
	 */
	public static final String OUTPUT_PARTITION_COUNT = OUTPUT_BINDING_KEY_PREFIX + "partitionCount";

}
