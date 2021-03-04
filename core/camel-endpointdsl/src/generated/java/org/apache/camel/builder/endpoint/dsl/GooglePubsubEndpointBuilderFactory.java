/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Send and receive messages to/from Google Cloud Platform PubSub Service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GooglePubsubEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGooglePubsubEndpointConsumerBuilder advanced() {
            return (AdvancedGooglePubsubEndpointConsumerBuilder) this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: common
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder ackMode(AckMode ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: common
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder ackMode(String ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder concurrentConsumers(
                Integer concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param loggerId the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder maxMessagesPerPoll(
                Integer maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The Service account key that can be used as credentials for the
         * PubSub publisher/subscriber. It can be loaded by default from
         * classpath, but you can prefix with classpath:, file:, or http: to
         * load the resource from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder synchronousPull(
                boolean synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder synchronousPull(
                String synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GooglePubsubEndpointConsumerBuilder basic() {
            return (GooglePubsubEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGooglePubsubEndpointProducerBuilder advanced() {
            return (AdvancedGooglePubsubEndpointProducerBuilder) this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: common
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder ackMode(AckMode ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: common
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder ackMode(String ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder concurrentConsumers(
                Integer concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param loggerId the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder maxMessagesPerPoll(
                Integer maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The Service account key that can be used as credentials for the
         * PubSub publisher/subscriber. It can be loaded by default from
         * classpath, but you can prefix with classpath:, file:, or http: to
         * load the resource from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder synchronousPull(
                boolean synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder synchronousPull(
                String synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GooglePubsubEndpointProducerBuilder basic() {
            return (GooglePubsubEndpointProducerBuilder) this;
        }
        /**
         * Should message ordering be enabled.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param messageOrderingEnabled the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder messageOrderingEnabled(
                boolean messageOrderingEnabled) {
            doSetProperty("messageOrderingEnabled", messageOrderingEnabled);
            return this;
        }
        /**
         * Should message ordering be enabled.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param messageOrderingEnabled the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder messageOrderingEnabled(
                String messageOrderingEnabled) {
            doSetProperty("messageOrderingEnabled", messageOrderingEnabled);
            return this;
        }
        /**
         * Pub/Sub endpoint to use. Required when using message ordering, and
         * ensures that messages are received in order even when multiple
         * publishers are used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param pubsubEndpoint the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder pubsubEndpoint(
                String pubsubEndpoint) {
            doSetProperty("pubsubEndpoint", pubsubEndpoint);
            return this;
        }
        /**
         * A custom GooglePubsubSerializer to use for serializing message
         * payloads in the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.pubsub.serializer.GooglePubsubSerializer&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder serializer(
                Object serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * A custom GooglePubsubSerializer to use for serializing message
         * payloads in the producer.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.pubsub.serializer.GooglePubsubSerializer&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default AdvancedGooglePubsubEndpointProducerBuilder serializer(
                String serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Google Pubsub component.
     */
    public interface GooglePubsubEndpointBuilder
            extends
                GooglePubsubEndpointConsumerBuilder,
                GooglePubsubEndpointProducerBuilder {
        default AdvancedGooglePubsubEndpointBuilder advanced() {
            return (AdvancedGooglePubsubEndpointBuilder) this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: common
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder ackMode(AckMode ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode&lt;/code&gt; type.
         * 
         * Default: AUTO
         * Group: common
         * 
         * @param ackMode the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder ackMode(String ackMode) {
            doSetProperty("ackMode", ackMode);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder concurrentConsumers(
                Integer concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of parallel streams consuming from the subscription.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Logger ID to use when a match to the parent route required.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param loggerId the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder loggerId(String loggerId) {
            doSetProperty("loggerId", loggerId);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder maxMessagesPerPoll(
                Integer maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: common
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
        /**
         * The Service account key that can be used as credentials for the
         * PubSub publisher/subscriber. It can be loaded by default from
         * classpath, but you can prefix with classpath:, file:, or http: to
         * load the resource from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder synchronousPull(
                boolean synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
        /**
         * Synchronously pull batches of messages.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param synchronousPull the value to set
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder synchronousPull(
                String synchronousPull) {
            doSetProperty("synchronousPull", synchronousPull);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Pubsub component.
     */
    public interface AdvancedGooglePubsubEndpointBuilder
            extends
                AdvancedGooglePubsubEndpointConsumerBuilder,
                AdvancedGooglePubsubEndpointProducerBuilder {
        default GooglePubsubEndpointBuilder basic() {
            return (GooglePubsubEndpointBuilder) this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.google.pubsub.GooglePubsubConstants$AckMode</code> enum.
     */
    enum AckMode {
        AUTO,
        NONE;
    }

    public interface GooglePubsubBuilders {
        /**
         * Google Pubsub (camel-google-pubsub)
         * Send and receive messages to/from Google Cloud Platform PubSub
         * Service.
         * 
         * Category: cloud,messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-google-pubsub
         * 
         * Syntax: <code>google-pubsub:projectId:destinationName</code>
         * 
         * Path parameter: projectId (required)
         * Project Id
         * 
         * Path parameter: destinationName (required)
         * Destination Name
         * 
         * @param path projectId:destinationName
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder googlePubsub(String path) {
            return GooglePubsubEndpointBuilderFactory.endpointBuilder("google-pubsub", path);
        }
        /**
         * Google Pubsub (camel-google-pubsub)
         * Send and receive messages to/from Google Cloud Platform PubSub
         * Service.
         * 
         * Category: cloud,messaging
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-google-pubsub
         * 
         * Syntax: <code>google-pubsub:projectId:destinationName</code>
         * 
         * Path parameter: projectId (required)
         * Project Id
         * 
         * Path parameter: destinationName (required)
         * Destination Name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path projectId:destinationName
         * @return the dsl builder
         */
        default GooglePubsubEndpointBuilder googlePubsub(
                String componentName,
                String path) {
            return GooglePubsubEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GooglePubsubEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GooglePubsubEndpointBuilderImpl extends AbstractEndpointBuilder implements GooglePubsubEndpointBuilder, AdvancedGooglePubsubEndpointBuilder {
            public GooglePubsubEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GooglePubsubEndpointBuilderImpl(path);
    }
}