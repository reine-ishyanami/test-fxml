package com.reine.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 注意：此包中所有类的字段访问权限均为default，即同一包下可以直接调用字段属性进行访问
 * @author reine
 */
public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Multi Controller App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
