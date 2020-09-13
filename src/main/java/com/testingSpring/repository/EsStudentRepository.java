package com.testingSpring.repository;

import com.testingSpring.model.ESStudents;
import com.testingSpring.model.Students;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author piyush kumar
 */
public interface EsStudentRepository extends ElasticsearchRepository<ESStudents,String> {

    List<ESStudents> findByMobile(String mobile);

}
