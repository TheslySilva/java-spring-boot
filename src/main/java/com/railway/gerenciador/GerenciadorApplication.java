package com.railway.gerenciador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GerenciadorApplication {
	public static void main(String[] args) {
		SpringApplication.run(com.railway.gerenciador.GerenciadorApplication.class, args);
	}
}
