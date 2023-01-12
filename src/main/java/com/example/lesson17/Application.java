package com.example.lesson17;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		UnivercityServiceImpl us = ctx.getBean(UnivercityServiceImpl.class);

		// Creating
		us.create(new Univercity("Politech", 4, 20, 1000, "Lviv"));
		us.create(new Univercity("Franko", 4, 20, 2000, "Lviv"));
		us.create(new Univercity("Shevchenka", 4, 20, 3000, "Kyiv"));
		// reading all
		us.findAll().stream().forEach(System.out::println);

		// read one
		System.out.println(us.findOne((long) 1));
		// update
		Univercity uodateUnivercity = us.findOne((long) 1);
		uodateUnivercity.setName("UpdatedUnivercity");
		us.update(uodateUnivercity);
		// look for updated univer
		System.out.println(us.findOne((long) 1));
		// remove updated univer
		us.delete((long) 1);
		// look for all univers
		us.findAll().stream().forEach(System.out::println);
	}

}
