package com.reine.test.test2;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * @author reine
 */
public class MainApp2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/test2/test2.fxml")));

        // 使用css选择器查找(标签选择器)
//        TextField textField = (TextField) root.lookup("TextField");
//        Button button = (Button) root.lookup("Button");
//        button.setOnAction(event -> textField.clear());

        // 使用css选择器查找(类选择器)
        TextField textField = (TextField) root.lookup(".text-field");
//        Button button = (Button) root.lookup(".button");
//        button.setOnAction(event -> textField.clear());

        // 使用css选择器查找(id选择器)
        Button button = (Button) root.lookup("#cssBtn");
        button.setOnAction(event -> textField.clear());


        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Main App 2");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
