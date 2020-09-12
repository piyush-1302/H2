package com.testingSpring.service;

import com.testingSpring.request.TestRequestBody;
import com.testingSpring.response.TestResponseBody;

/**
 * @author piyush kumar
 */
public interface TestService {

    TestResponseBody insert(TestRequestBody value);

    TestResponseBody get(String value);

    TestResponseBody update(TestRequestBody value);

    String delete(String value);

}
