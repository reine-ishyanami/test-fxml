package com.reine.test.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

// 2. 使用@FXML注解标记initialize方法
public class MainController2 {

    @FXML
    private URL location;
    @FXML
    private ResourceBundle resources;

    private final String info;
    @FXML
    private TextField tf;

    @FXML
    void onClearTextAction(ActionEvent event) {
        tf.clear();
    }

    public MainController2(String info) {
        this.info = info;
    }

    @FXML
    void initialize() {
        tf.setText(info);
    }
}
