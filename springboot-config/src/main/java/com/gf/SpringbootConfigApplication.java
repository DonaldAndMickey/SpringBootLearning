package com.gf;

import com.gf.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootConfigApplication.class, args);
		Person bean = run.getBean("person",Person.class);
		System.out.println(bean);
	}
}
