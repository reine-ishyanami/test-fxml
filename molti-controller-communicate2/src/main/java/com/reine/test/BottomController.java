package com.reine.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class BottomController {

    @FXML
    Label labelInfo;

    @FXML
    void onMoveDown(ActionEvent event) {
        CenterController centerController = (CenterController) ControllerManager.controllerMap.get("centerController");
        Rectangle rect = centerController.rect;
        rect.setLayoutY(rect.getLayoutY() + 5);
    }

    @FXML
    void onMoveLeft(ActionEvent event) {
        CenterController centerController = (CenterController) ControllerManager.controllerMap.get("centerController");
        Rectangle rect = centerController.rect;
        rect.setLayoutX(rect.getLayoutX() - 5);
    }

    @FXML
    void onMoveRight(ActionEvent event) {
        CenterController centerController = (CenterController) ControllerManager.controllerMap.get("centerController");
        Rectangle rect = centerController.rect;
        rect.setLayoutX(rect.getLayoutX() + 5);
    }

    @FXML
    void onMoveUp(ActionEvent event) {
        CenterController centerController = (CenterController) ControllerManager.controllerMap.get("centerController");
        Rectangle rect = centerController.rect;
        rect.setLayoutY(rect.getLayoutY() - 5);
    }


    @FXML
    void initialize() {
        ControllerManager.controllerMap.put("bottomController", this);
    }

}
