package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleStsDemoApplication implements ApplicationRunner{
	@Autowired
	EmpDao empDao;
	public static void main(String[] args) {
		SpringApplication.run(SampleStsDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Emp emp = new Emp();
		emp.setEmpName("Imaya");
		empDao.save(emp);
	}

}
