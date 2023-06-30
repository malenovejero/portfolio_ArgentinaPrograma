
package com.portfolio.Portfolio;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Clase que habilita CORS
 * @author malen
 */
@EnableWebMvc
@Configuration
public class WebConfi implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry) { registry.addMapping("/**");
    } 
}
