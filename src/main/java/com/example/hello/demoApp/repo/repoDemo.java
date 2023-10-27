package com.example.hello.demoApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.hello.demoApp.entity.EntityClass;

public interface repoDemo extends JpaRepository<EntityClass, Integer> {

}
