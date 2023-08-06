package com.reine.test.test1;

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
public class MainApp1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/test1/test1.fxml")));

        // 使用组件索引坐标查找组件(不推荐这种方式，顺序不确定)
        ObservableList<Node> nodes = root.getChildrenUnmodifiable();
        TextField textField = (TextField) nodes.get(0);
        Button button = (Button) nodes.get(1);
        button.setOnAction(event -> textField.clear());


        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Main App 1");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
