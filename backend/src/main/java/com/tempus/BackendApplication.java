
package com.tempus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Esta línea es la que hace la magia
public class BackendApplication {

    public static void main(String[] args) {
        // Esta línea arranca el servidor Tomcat en el puerto 8080
        SpringApplication.run(BackendApplication.class, args);
    }
}