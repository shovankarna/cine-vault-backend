package dev.shovan.movies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                    .allowedOrigins("http://localhost:3000") // Allow requests from your frontend
                    .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify the allowed HTTP methods
                    .allowedHeaders("*") // Allow any request headers for simplicity
                    .allowCredentials(true); // Allow credentials like cookies
            }
        };
    }
}

