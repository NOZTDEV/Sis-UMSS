package org.umss.sis_umss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class SisUmssApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisUmssApplication.class, args);
	}

}
