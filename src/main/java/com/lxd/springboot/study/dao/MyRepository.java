package com.lxd.springboot.study.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MyRepository<T,Integer> extends JpaRepository<T,Integer> {

}
