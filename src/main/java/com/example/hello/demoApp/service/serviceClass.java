package com.example.hello.demoApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.demoApp.entity.EntityClass;
import com.example.hello.demoApp.repo.repoDemo;

@Service
public class serviceClass {

	@Autowired
	private repoDemo repo;
	
	public Iterable<EntityClass> getAll(){
		return repo.findAll();
	}
	
	public EntityClass GetId(Integer id) {
		return repo.findById(id).orElse(new EntityClass());
	}
	
	public EntityClass create(EntityClass obj) {
		return repo.save(obj);
	}
	
	public EntityClass update(Integer id,String nmail) {
		EntityClass obj=GetId(id);
		obj.setEmail(nmail);
		return repo.save(obj);
		
	}
	
	public void deleteall(Integer id) {
		repo.deleteById(id);
	}
}
