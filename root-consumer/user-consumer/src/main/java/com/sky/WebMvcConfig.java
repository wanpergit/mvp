package com.sky;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Ningxb
 * @Date: 2021-01-11 23:31
 * @description: ${description}
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 跨域访问设置
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:9050")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}
