package com.reine.test.test1;

import com.reine.test.MainLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author reine
 */
public class MainApp1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainLayout root = new MainLayout();
        root.setText("Open with Application1");
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("单文件测试");
        primaryStage.show();
    }
}
