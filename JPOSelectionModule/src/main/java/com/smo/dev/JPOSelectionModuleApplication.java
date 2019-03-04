package com.smo.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author Ehtu
 *
 */
@SpringBootApplication
public class JPOSelectionModuleApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/smo");
		SpringApplication.run(JPOSelectionModuleApplication.class, args);
	}
}
