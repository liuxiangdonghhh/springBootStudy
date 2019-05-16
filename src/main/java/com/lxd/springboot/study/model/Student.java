package com.lxd.springboot.study.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Column(length = 32)
    @Id
    private Integer studentId;

    @Column(length = 16)
    private String studentName;

    @Column(length = 32)
    private String studentClass;

}
