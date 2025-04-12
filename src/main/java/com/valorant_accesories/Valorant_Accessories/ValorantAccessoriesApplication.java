package com.valorant_accesories.Valorant_Accessories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {"com.valorant_accesories.Valorant_Accessories"})
public class ValorantAccessoriesApplication {
	//deploying issue


	public static void main(String[] args) {
		SpringApplication.run(ValorantAccessoriesApplication.class, args);
	}

}
