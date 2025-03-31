package com.valorant_accesories.Valorant_Accessories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ValorantAccessoriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValorantAccessoriesApplication.class, args);
	}

}
