package com.sample.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sample.myapp.dto.Person;

// 데이터에 접근하는 인터페이스!
@Repository
public interface PersonDAO {
	List<Person> getPersons();
	Person getPerson(Integer id);
	void insertPerson(Person person);
	Integer updatePerson(@Param("id") Integer id, 
			@Param("person") Person person);
	Integer deletePerson(Integer id);
}
