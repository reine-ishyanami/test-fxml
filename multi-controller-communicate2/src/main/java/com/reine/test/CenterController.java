package com.reine.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class CenterController {

    @FXML
    Rectangle rect;


    @FXML
    void onSendInfoAction(ActionEvent event) {
        BottomController bottomController =
                (BottomController) ControllerManager.controllerMap.get("bottomController");
        bottomController.labelInfo
                .setText(String.format("位置信息:(%.3f,%.3f)", rect.getLayoutX(), rect.getLayoutY()));
    }

    @FXML
    void initialize() {
        ControllerManager.controllerMap.put("centerController", this);
    }


}
