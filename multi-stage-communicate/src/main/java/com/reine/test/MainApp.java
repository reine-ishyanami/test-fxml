package com.reine.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author reine
 */
public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("/fxml/master.fxml"));
        Parent mainRoot = mainLoader.load();
        primaryStage.setScene(new Scene(mainRoot));
        primaryStage.setTitle("Multi Windows App");

        FXMLLoader slaverLoader = new FXMLLoader(getClass().getResource("/fxml/slaver.fxml"));
        Parent slaverRoot = slaverLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(slaverRoot));
        stage.initOwner(primaryStage);

        primaryStage.show();
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
