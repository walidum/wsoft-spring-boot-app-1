package com.wsoft.ptest1.repositories;

import com.wsoft.ptest1.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author b.walid
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
