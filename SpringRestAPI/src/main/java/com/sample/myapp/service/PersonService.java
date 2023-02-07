package com.sample.myapp.service;

import java.util.List;
import com.sample.myapp.dto.Person;

public interface PersonService {
	List<Person> getPersons();
	Person getPerson(Integer id);
	void insertPerson(Person person);
}