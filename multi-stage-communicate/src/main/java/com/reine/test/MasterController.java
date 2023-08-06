package com.reine.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MasterController {

    @FXML
    TextField tfColor;

    @FXML
    void onUpdateSlaverBgColorAction(ActionEvent event) {
        SlaverController slaverController = (SlaverController) ControllerManager.controllerMap.get("slaverController");
        slaverController.miniPane.setStyle(String.format("-fx-background-color: %s", tfColor.getText()));
    }

    @FXML
    void initialize() {
        ControllerManager.controllerMap.put("masterController", this);
    }

}

