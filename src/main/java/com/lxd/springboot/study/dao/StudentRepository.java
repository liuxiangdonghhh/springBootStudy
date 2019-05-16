package com.lxd.springboot.study.dao;

import com.lxd.springboot.study.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MyRepository<Student,Integer> {


}
