package com.example.transactionconcurency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TransactionConcurencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionConcurencyApplication.class, args);
	}

}
