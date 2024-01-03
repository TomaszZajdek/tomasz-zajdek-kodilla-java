package com.kodilla.hibernate.manytomany.dao;

import org.springframework.data.repository.query.Param;
import java.util.List;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository <Employee, Integer> {
    @Query
    List<Employee> retrieveLastnameEmployees(@Param("LASTNAME") String lastname);
}
