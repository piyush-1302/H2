package com.testingSpring.service.impl;

import com.testingSpring.model.Students;
import com.testingSpring.repository.StudentRepository;
import com.testingSpring.request.TestRequestBody;
import com.testingSpring.response.TestResponseBody;
import com.testingSpring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author piyush kumar
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public TestResponseBody insert(TestRequestBody value) {

        studentRepository.insert(value.getMobile(),value.getName());
        TestResponseBody testResponseBody = new TestResponseBody();
        testResponseBody.setResult("INSERT");

        return testResponseBody;
    }

    @Override
    public TestResponseBody get(String value) {

        TestResponseBody testResponseBody = new TestResponseBody();

        studentRepository.findByName(value);

        return testResponseBody;
    }

    @Override
    public TestResponseBody update(TestRequestBody value) {

        studentRepository.updateByMobile(value.getMobile(),value.getName());
        TestResponseBody testResponseBody = new TestResponseBody();
        testResponseBody.setResult("UPDATE");

        return testResponseBody;
    }

    @Override
    public String delete(String value) {
        return "DELETE";
    }
}
