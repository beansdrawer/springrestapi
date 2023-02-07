package com.sample.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.myapp.dto.Person;
import com.sample.myapp.service.PersonService;

@RestController
public class PersonController {
	
	// 이 어노테이션 하나로 서비스와의 매핑이 자동으로 처리된다.
	@Autowired
	private PersonService service;
	
	@GetMapping(path="/test")
	public Person personTest() {
		Person person = new Person();
		person.setId(3);
		person.setName("yoo");
		person.setJob("sales");
		return person;
	}
	
	@GetMapping(path="/persons")
	public List<Person> getPersons(){
		return service.getPersons();
	}
	
	@GetMapping(path="/persons/{id}")
	public Person getPerson(@PathVariable Integer id) {
		return service.getPerson(id);
	}
	
	
	// @RequestBody : 요청시 포함할 데이터 
	@PostMapping(path="/persons")
	public Person insertPerson(@RequestBody Person person) {
		service.insertPerson(person);
		return person;
	}
	
	// 수정 요청 
	@PutMapping(path="/persons/{id}")
	public Person updatePerson(@PathVariable Integer id, 
			@RequestBody Person person) {
		return service.updatePerson(id, person);
	}
	
}




