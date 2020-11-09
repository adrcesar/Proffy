package br.com.nlw.Proffy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class ProffyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProffyApplication.class, args);
	}

}
