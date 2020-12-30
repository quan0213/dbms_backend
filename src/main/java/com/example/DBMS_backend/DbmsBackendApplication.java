package com.example.DBMS_backend;

import com.example.DBMS_backend.classpk.model.Class;
import com.example.DBMS_backend.classpk.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbmsBackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(DbmsBackendApplication.class, args);
	}

}
