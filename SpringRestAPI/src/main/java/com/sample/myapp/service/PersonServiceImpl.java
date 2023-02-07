package com.sample.myapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.myapp.dao.PersonDAO;
import com.sample.myapp.dto.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO dao;
	
	@Override
	public List<Person> getPersons() {
		
		System.out.println("모든 사람을 원해!");
		
		return dao.getPersons();
	}

	@Override
	public Person getPerson(Integer id) {
		
		System.out.println("단 한명의 사람을 원해!");
		
		return dao.getPerson(id);
	}

	@Override
	public void insertPerson(Person person) {
		
		System.out.println("사람 한명 추가요~~");
		
		dao.insertPerson(person);
		
	}
	

}