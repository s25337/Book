package com.example.book.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Dopuszczamy wszystkie ścieżki zaczynające się na /api
                .allowedOrigins("http://localhost:3000")  // Adres aplikacji React
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Dopuszczalne metody
                .allowedHeaders("*")  // Dopuszczalne nagłówki
                .allowCredentials(true);  // Zezwalamy na przesyłanie ciasteczek, jeśli wymagane
    }
}