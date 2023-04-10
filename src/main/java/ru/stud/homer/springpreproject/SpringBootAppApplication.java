package ru.stud.homer.springpreproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.stud.homer.springpreproject.util.Util;

@SpringBootApplication
@EnableConfigurationProperties(Util.class)
public class SpringBootAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAppApplication.class, args);

	}

}
