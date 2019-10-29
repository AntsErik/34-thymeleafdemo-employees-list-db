package ee.praktika.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ee.praktika.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //no need to write any code, CRUD methods will be received for free.
}
