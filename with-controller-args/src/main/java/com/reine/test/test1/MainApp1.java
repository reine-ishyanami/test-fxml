package com.reine.test.test1;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.util.Objects;

/**
 * @author reine
 */
public class MainApp1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/test1/test1.fxml")));
        HostServices hostServices = getHostServices();
        // 1. 使用setControllerFactory使用构造器传参
        loader.setControllerFactory(param -> new MainController1(hostServices));

        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Main App 1");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
