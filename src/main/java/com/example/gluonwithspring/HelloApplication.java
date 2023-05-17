package com.example.gluonwithspring;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@Log4j2
public class HelloApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void start(Stage stage) throws IOException {
        log.info("Starting the application");
        final SpringApplicationBuilder springBuilder = new SpringApplicationBuilder(SpringFxMain.class);

        // Lancement de Spring
        applicationContext = springBuilder.run();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent helloView = fxmlLoader.load();
        HelloController helloController = fxmlLoader.getController();
        helloController.setApplicationContext(applicationContext);

        Scene scene = new Scene(helloView, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}