package com.example.gluonwithspring;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration({
       SpringFxConfiguration.class
})
public class SpringFxMain {
}
