package com.mazlumabul.sms.repository;

import com.mazlumabul.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student,Long> {

}
