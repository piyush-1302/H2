package com.testingSpring.controller;

import com.testingSpring.request.TestRequestBody;
import com.testingSpring.response.TestResponseBody;
import com.testingSpring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author piyush kumar
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(path="/insert",method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<TestResponseBody>insert(@RequestBody TestRequestBody value){
        return ResponseEntity.status(HttpStatus.OK).body(testService.insert(value));
    }

    @RequestMapping(path="/get",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<TestResponseBody>get(){
        return ResponseEntity.status(HttpStatus.OK).body(testService.get("piyush"));
    }

    @RequestMapping(path="/update",method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<TestResponseBody>update(@RequestBody TestRequestBody value){
        return ResponseEntity.status(HttpStatus.OK).body(testService.update(value));
    }
}





