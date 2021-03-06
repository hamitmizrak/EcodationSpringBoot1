package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//exclude:dahil etmemek
/*@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)*/

@SpringBootApplication

//Auditing calismasi icin izin
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class EcodationSpringBoot1Application {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled","false");
        System.setProperty("java.awt.headless", "false"); //Disables headless
        SpringApplication.run(EcodationSpringBoot1Application.class, args);
    }

}
