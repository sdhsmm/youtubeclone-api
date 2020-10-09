package com.task.youtubeclone.mvcconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVCConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*").allowedOrigins("unsafe:D:\\WhatsApp Video 2020-10-08 at 12.09.45.mp4", "http://localhost:4200", "http://127.0.0.1:8082", "http://192.168.43.63:8081");
	}
	
	
	

}
