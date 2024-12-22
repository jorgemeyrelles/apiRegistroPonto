package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Pode adicionar mais origens se necessário
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS") // Incluindo PATCH e OPTIONS
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowCredentials(true) // Permite envio de cookies e credenciais
                .maxAge(3600); // Tempo máximo (em segundos) que as configurações de CORS podem ser armazenadas no cache do navegador
    }
}