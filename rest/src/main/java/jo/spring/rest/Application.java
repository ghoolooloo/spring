package jo.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
/**
 * 不使用内嵌的Web容器，而使用外部Web容器时，才需要扩展SpringBootServletInitializer。
 * 注：使用 mvn spring-boot:run 启动应用时，总是使用内嵌Web容器，而不管是否有扩展SpringBootServletInitializer。
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}