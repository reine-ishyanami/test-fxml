package com.reine.test.test1;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

// 1. 实现Initializable接口，重写initialize方法
public class MainController1 implements Initializable {

    private final HostServices info;
    @FXML
    private TextField tf;

    @FXML
    void onClearTextAction(ActionEvent event) {
        tf.clear();
        info.showDocument("https://www.baidu.com");
    }

    public MainController1(HostServices info) {
        this.info = info;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        tf.setText(info);
    }
}
