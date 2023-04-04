package com.example.demo;

import com.example.demo.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
    MongoTemplate mongoTemplate;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<String> testMethod() {

		List<String> names= mongoTemplate.query(Book.class).distinct("name").as(String.class).all();
		System.out.println("names"+ names);
		return  ResponseEntity.ok("Test  application");
	}

}
