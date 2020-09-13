package com.testingSpring.model;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author piyush kumar
 */
@Document(indexName= "test", type= "employee")
public class ESStudents {

    private String name;
    private String mobile;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
