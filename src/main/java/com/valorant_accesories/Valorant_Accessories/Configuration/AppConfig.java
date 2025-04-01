package com.valorant_accesories.Valorant_Accessories.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        System.out.println("✅ RestTemplate Bean Created!");
        return new RestTemplate();
    }
}

