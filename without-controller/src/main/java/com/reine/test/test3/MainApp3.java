package com.reine.test.test3;

import javafx.application.Application;
import javafx.collections.ObservableMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * @author reine
 */
public class MainApp3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Objects.requireNonNull(getClass().getResource("/test3/test3.fxml")));
        Parent root = loader.load();
        // 通过fx:id获取组件(推荐)
        ObservableMap<String, Object> namespace = loader.getNamespace();
        TextField tf = (TextField) namespace.get("tf");
        Button btn = (Button) namespace.get("btn");
        btn.setOnAction(event -> tf.clear());

        ToggleGroup mygroup = (ToggleGroup) namespace.get("mygroup");
        System.out.println(mygroup == null); // false

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Main App 3");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
