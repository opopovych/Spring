package com.example.lesson16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		DaoLayerImpl daoLayerImpl = ctx.getBean(DaoLayerImpl.class);
		Student student = new Student();
		student.setId(1);
		student.setAge(15);
		student.setName("Oleh");
		daoLayerImpl.create(student);
		Student student2 = new Student();
		student2.setId(2);
		student2.setAge(17);
		student2.setName("Yurii");
		daoLayerImpl.create(student2);
		System.out.println(daoLayerImpl.readAll());
		System.out.println(daoLayerImpl.read(0));
		daoLayerImpl.delete(0);
		System.out.println(daoLayerImpl.readAll());
	}

}
