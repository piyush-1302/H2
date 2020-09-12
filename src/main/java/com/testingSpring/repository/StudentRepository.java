package com.testingSpring.repository;

import com.testingSpring.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author piyush kumar
 */

public interface StudentRepository extends JpaRepository<Students,Long> {

    @Query(value = "SELECT *FROM students WHERE name=?1", nativeQuery = true)
    List<Students> findByName(String chars);

    @Transactional
    @Modifying
    @Query(value = "UPDATE students SET name=?2 WHERE mobile=?1", nativeQuery = true)
    void updateByMobile(String mobile,String name);

    @Transactional
    @Modifying
    @Query(value = "INSERT into students(name,mobile) VALUES (?2,?1)", nativeQuery = true)
    void insert(String mobile,String name);
}
