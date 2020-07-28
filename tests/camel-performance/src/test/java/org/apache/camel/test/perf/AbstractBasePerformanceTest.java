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
package org.apache.camel.test.perf;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AbstractBasePerformanceTest extends CamelTestSupport {

    protected static final String BODY_1KB_PAYLOAD = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"
        + "<soapenv:Header><routing xmlns=\"http://someuri\">xadmin;server1;community#1.0##</routing></soapenv:Header>"
        + "<soapenv:Body>"
        + "<m:buyStocks xmlns:m=\"http://services.samples/xsd\">"
        + "<order><symbol>IBM</symbol><buyerID>asankha</buyerID><price>140.34</price><volume>2000</volume></order>"
        + "<order><symbol>MSFT</symbol><buyerID>ruwan</buyerID><price>23.56</price><volume>8030</volume></order>"
        + "<order><symbol>SUN</symbol><buyerID>indika</buyerID><price>14.56</price><volume>500</volume></order>"
        + "<order><symbol>GOOG</symbol><buyerID>chathura</buyerID><price>60.24</price><volume>40000</volume></order>"
        + "<order><symbol>IBM</symbol><buyerID>asankha</buyerID><price>140.34</price><volume>2000</volume></order>"
        + "<order><symbol>MSFT</symbol><buyerID>ruwan</buyerID><price>23.56</price><volume>803000</volume></order>"
        + "<order><symbol>SUN</symbol><buyerID>indika</buyerID><price>14.56</price><volume>5000</volume></order>"
        + "</m:buyStocks>"
        + "</soapenv:Body>"
        + "</soapenv:Envelope>";

    protected final Logger log = LoggerFactory.getLogger(getClass());

    protected String getPayload() {
        return BODY_1KB_PAYLOAD;
    }

    protected void resetMock(int count) {
        MockEndpoint mock = getMockEndpoint("mock:end");
        mock.reset();
        mock.setRetainFirst(0);
        mock.setRetainLast(0);
        mock.expectedMessageCount(count);
    }

    protected void execute(int count) {
        for (int counter = 0; counter < count; counter++) {
            template.sendBody(getPayload());
        }
    }

}
