package com.springweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWeatherApplication.class, args);
	}

}
