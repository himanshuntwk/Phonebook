package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

	@SpringBootApplication//(scanBasePackages={"com"})
	@ComponentScan(basePackages={"com"})
	public class PhonebookMain {

		public static void main(String[] args) throws Exception {
			SpringApplication.run(PhonebookMain.class, args);
		}
	}
