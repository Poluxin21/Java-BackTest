package org.atlas.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.atlas.app.repositories")
@EntityScan(basePackages = "org.atlas.app.models")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
