package com.lxd.springboot.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.lxd.springboot.study.dao.StudentRepository;
import com.lxd.springboot.study.enums.StatusCode;
import com.lxd.springboot.study.model.Student;
import com.lxd.springboot.study.result.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonResult addStudent(@RequestBody JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        Integer id = Integer.parseInt(jsonObject.getString("id"));
        String studentClass = jsonObject.getString("class");

        Student student = new Student();
        student.setStudentId(id);
        student.setStudentName(name);
        student.setStudentClass(studentClass);

        /*if(student.getStudentName().equals("lxd")){
            throw new MyException(StatusCode.EXCEPTION);
        }*/

        studentRepository.saveAndFlush(student);
        return new JsonResult(StatusCode.SUCCESS);
    }
}
