package dev.Movies.adwait.movies.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfiguration {
    @Value("${CORS_ALLOWEDMETHODS}")
    private  String allowedMethods;

    @Value("${CORS_ALLOWEDHEADERS}")
    private  String allowedHeaders;

    @Value("${CORS_CONFIGURATION}")
    private  String corsConfiguration;

    @Bean
    public WebMvcConfigurer corsConfigure() {
        System.out.println(corsConfiguration);
        return  new WebMvcConfigurer(){

            public void addCorsMappings(final CorsRegistry registry){

                registry.addMapping(corsConfiguration).allowedHeaders(allowedHeaders).allowedMethods(allowedMethods);
            }
        };
    }
}
