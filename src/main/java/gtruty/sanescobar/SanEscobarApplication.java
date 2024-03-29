package gtruty.sanescobar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class SanEscobarApplication implements WebMvcConfigurer {



    public static void main(String[] args) {
        SpringApplication.run(SanEscobarApplication.class, args);
    }

}
