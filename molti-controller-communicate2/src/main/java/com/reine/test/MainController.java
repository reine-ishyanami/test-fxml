package com.reine.test;


import javafx.fxml.FXML;

public class MainController {

    @FXML
    void initialize() {
        ControllerManager.controllerMap.put("mainController", this);
    }
}
