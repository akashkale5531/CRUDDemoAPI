package com.example.hello.demoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.demoApp.entity.EntityClass;
import com.example.hello.demoApp.service.serviceClass;

@RestController
public class ControllerClass {
	
	@Autowired
	private serviceClass service;
	
	@GetMapping("/getAll")
	public Iterable<EntityClass> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public EntityClass getById(@PathVariable Integer id) {
		return service.GetId(id);
	}
	
	@PostMapping("/create")
	public EntityClass create(@RequestBody EntityClass obj) {
		return service.create(obj);
	}
	
	@PutMapping("/update")
	public EntityClass update(@PathVariable Integer id,@PathVariable String nmail) {
		return service.update(id, nmail);
	}
	
	
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable Integer id) {
		service.deleteall(id);
	}
	
	
	
	
	
	
	
	
	
	
}
