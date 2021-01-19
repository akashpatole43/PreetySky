package com.dassaultSystemes.PillsReminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan({"com.dassaultSystemes.PillsReminder", "Controller", "Service"})
//@SpringBootApplication(scanBasePackages="com.dassaultSystemes.PillsReminder.Controller")
@SpringBootApplication
public class PillsReminderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PillsReminderApplication.class, args);
	}

}
