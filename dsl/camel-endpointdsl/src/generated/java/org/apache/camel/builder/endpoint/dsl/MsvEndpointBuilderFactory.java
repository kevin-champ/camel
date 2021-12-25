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

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validate XML payloads using Multi-Schema Validator (MSV).
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MsvEndpointBuilderFactory {


    /**
     * Builder for endpoint for the MSV component.
     */
    public interface MsvEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMsvEndpointBuilder advanced() {
            return (AdvancedMsvEndpointBuilder) this;
        }
        /**
         * Whether to fail if no body exists.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param failOnNullBody the value to set
         * @return the dsl builder
         */
        default MsvEndpointBuilder failOnNullBody(boolean failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no body exists.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param failOnNullBody the value to set
         * @return the dsl builder
         */
        default MsvEndpointBuilder failOnNullBody(String failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param failOnNullHeader the value to set
         * @return the dsl builder
         */
        default MsvEndpointBuilder failOnNullHeader(boolean failOnNullHeader) {
            doSetProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param failOnNullHeader the value to set
         * @return the dsl builder
         */
        default MsvEndpointBuilder failOnNullHeader(String failOnNullHeader) {
            doSetProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * To validate against a header instead of the message body.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param headerName the value to set
         * @return the dsl builder
         */
        default MsvEndpointBuilder headerName(String headerName) {
            doSetProperty("headerName", headerName);
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
        default MsvEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default MsvEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MSV component.
     */
    public interface AdvancedMsvEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MsvEndpointBuilder basic() {
            return (MsvEndpointBuilder) this;
        }
        /**
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.processor.validation.ValidatorErrorHandler&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param errorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder errorHandler(
                org.apache.camel.support.processor.validation.ValidatorErrorHandler errorHandler) {
            doSetProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.processor.validation.ValidatorErrorHandler&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param errorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder errorHandler(String errorHandler) {
            doSetProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom LSResourceResolver. Do not use together with
         * resourceResolverFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.w3c.dom.ls.LSResourceResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceResolver the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder resourceResolver(
                org.w3c.dom.ls.LSResourceResolver resourceResolver) {
            doSetProperty("resourceResolver", resourceResolver);
            return this;
        }
        /**
         * To use a custom LSResourceResolver. Do not use together with
         * resourceResolverFactory.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.w3c.dom.ls.LSResourceResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceResolver the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder resourceResolver(
                String resourceResolver) {
            doSetProperty("resourceResolver", resourceResolver);
            return this;
        }
        /**
         * To use a custom LSResourceResolver which depends on a dynamic
         * endpoint resource URI. The default resource resolver factory resturns
         * a resource resolver which can read files from the class path and file
         * system. Do not use together with resourceResolver.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.validator.ValidatorResourceResolverFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceResolverFactory the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder resourceResolverFactory(
                org.apache.camel.component.validator.ValidatorResourceResolverFactory resourceResolverFactory) {
            doSetProperty("resourceResolverFactory", resourceResolverFactory);
            return this;
        }
        /**
         * To use a custom LSResourceResolver which depends on a dynamic
         * endpoint resource URI. The default resource resolver factory resturns
         * a resource resolver which can read files from the class path and file
         * system. Do not use together with resourceResolver.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.validator.ValidatorResourceResolverFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceResolverFactory the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder resourceResolverFactory(
                String resourceResolverFactory) {
            doSetProperty("resourceResolverFactory", resourceResolverFactory);
            return this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.validation.SchemaFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param schemaFactory the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder schemaFactory(
                javax.xml.validation.SchemaFactory schemaFactory) {
            doSetProperty("schemaFactory", schemaFactory);
            return this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.xml.validation.SchemaFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param schemaFactory the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder schemaFactory(String schemaFactory) {
            doSetProperty("schemaFactory", schemaFactory);
            return this;
        }
        /**
         * Configures the W3C XML Schema Namespace URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: http://www.w3.org/2001/XMLSchema
         * Group: advanced
         * 
         * @param schemaLanguage the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder schemaLanguage(String schemaLanguage) {
            doSetProperty("schemaLanguage", schemaLanguage);
            return this;
        }
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param useSharedSchema the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder useSharedSchema(
                boolean useSharedSchema) {
            doSetProperty("useSharedSchema", useSharedSchema);
            return this;
        }
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param useSharedSchema the value to set
         * @return the dsl builder
         */
        default AdvancedMsvEndpointBuilder useSharedSchema(
                String useSharedSchema) {
            doSetProperty("useSharedSchema", useSharedSchema);
            return this;
        }
    }

    public interface MsvBuilders {
        /**
         * MSV (camel-msv)
         * Validate XML payloads using Multi-Schema Validator (MSV).
         * 
         * Category: validation
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-msv
         * 
         * Syntax: <code>msv:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * URL to a local resource on the classpath, or a reference to lookup a
         * bean in the Registry, or a full URL to a remote resource or resource
         * on the file system which contains the XSD to validate against.
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        @Deprecated
        default MsvEndpointBuilder msv(String path) {
            return MsvEndpointBuilderFactory.endpointBuilder("msv", path);
        }
        /**
         * MSV (camel-msv)
         * Validate XML payloads using Multi-Schema Validator (MSV).
         * 
         * Category: validation
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-msv
         * 
         * Syntax: <code>msv:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * URL to a local resource on the classpath, or a reference to lookup a
         * bean in the Registry, or a full URL to a remote resource or resource
         * on the file system which contains the XSD to validate against.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        @Deprecated
        default MsvEndpointBuilder msv(String componentName, String path) {
            return MsvEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    @Deprecated
    static MsvEndpointBuilder endpointBuilder(String componentName, String path) {
        class MsvEndpointBuilderImpl extends AbstractEndpointBuilder implements MsvEndpointBuilder, AdvancedMsvEndpointBuilder {
            public MsvEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MsvEndpointBuilderImpl(path);
    }
}