package com.example.gluonwithspring;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;

@Log4j2
public class HelloController {
    @FXML
    private Label welcomeText;

    @Setter
    private ApplicationContext applicationContext;

    @FXML
    protected void onHelloButtonClick() {
        final String helloWorldMessage = applicationContext.getBean("helloWorldMessage", String.class);

        welcomeText.setText(helloWorldMessage);
        log.info(helloWorldMessage);
    }

}