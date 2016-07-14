package com.connectworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.connectworld")
public class ConnectworldApplication {
	  @RequestMapping("/")
	  public String home() {
	    return "connect world, A map will replace this page";
	  }


	public static void main(String[] args) {
		SpringApplication.run(ConnectworldApplication.class, args);
	}
}
