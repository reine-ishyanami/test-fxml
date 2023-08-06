package com.reine.test.test2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * @author reine
 */
public class MainApp2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/test2/test2.fxml")));
        // 2. 在fxml文件中不配置fx:controller，在代码中设置controller
        loader.setController(new MainController2("秋水共长天一色"));

        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Main App 1");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
