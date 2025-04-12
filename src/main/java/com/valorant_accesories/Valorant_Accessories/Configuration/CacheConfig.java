package com.valorant_accesories.Valorant_Accessories.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {
    @Bean
    public Caffeine caffeine(){
        return Caffeine.newBuilder().expireAfterWrite(60, TimeUnit.MINUTES).maximumSize(1000);
    }

    public CacheManager cacheManager(Caffeine caffeine){
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager.setCaffeine(caffeine);
        return cacheManager;
        //just to push
    }
}
