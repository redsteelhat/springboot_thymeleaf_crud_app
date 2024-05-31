package com.redsteel.springboot_thymeleaf_crud_app.repository;

import java.util.List;

import com.redsteel.springboot_thymeleaf_crud_app.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository <Student, Long> {
    List<Student> findByName(String name);
}
