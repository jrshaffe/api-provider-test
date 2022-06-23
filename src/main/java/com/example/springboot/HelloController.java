package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

	@Value("${firstName}")
	private String firstName;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Tanzu! " + firstName;
	}

	@RequestMapping("/people")
	public List<Person> people() {
		Person larry = new Person("Larry", "Shaffer", 124);
		List<Person> people = new ArrayList<>();
		people.add(larry);
		return new ArrayList<>(people);
	}

}