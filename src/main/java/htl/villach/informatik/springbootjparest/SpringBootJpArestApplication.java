package htl.villach.informatik.springbootjparest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class SpringBootJpArestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpArestApplication.class, args);
    }

    @GetMapping("/api/v1/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
