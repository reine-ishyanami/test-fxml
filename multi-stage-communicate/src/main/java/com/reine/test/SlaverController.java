package com.reine.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class SlaverController {

    @FXML
    AnchorPane miniPane;

    @FXML
    void onClearTextAction(ActionEvent event) {
        MasterController masterController = (MasterController) ControllerManager.controllerMap.get("masterController");
        masterController.tfColor.clear();
    }

    @FXML
    void initialize() {
        ControllerManager.controllerMap.put("slaverController", this);
    }


}
