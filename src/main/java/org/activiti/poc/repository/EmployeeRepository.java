package org.hazelcast.poc.repository;

import org.hazelcast.poc.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Employee findByPersonId(Integer personId);

    List<Employee> findByCompany(String company);

}