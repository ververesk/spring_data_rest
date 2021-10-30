package com.grigorovich.springboot.spring_data_rest.dao;



import com.grigorovich.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//<artifactId>spring-boot-starter-data-rest</artifactId> значит контроллер создается сам
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { //с каким классаом работает репозиторий, тип primary key
  //стандартные CRUD методы прописывать не надо

}
