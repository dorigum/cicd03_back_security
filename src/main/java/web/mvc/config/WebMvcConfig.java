package web.mvc.config;

import org.springframework.context.annotation.Configuration;
import
        org.springframework.web.servlet.config.annotation.CorsRegistry;
import
        org.springframework.web.servlet.config.annotation.EnableWebMvc;
import
        org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * WebMvcConfigurer 를 이용해서 @CrossOrigin 글로벌 설정
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://15.164.226.161", "http://15.164.226.161:80")
                .allowedOrigins("http://polar-bear.o-r.kr", "https://polar-bear.o-r.kr")
                .allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE");
    }
}