package com.reine.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class CenterController {

    @FXML
    Rectangle rect;

    MainController mainController;

    @FXML
    void onSendInfoAction(ActionEvent event) {
        mainController.bottomController.labelInfo
                .setText(String.format("位置信息:(%.3f,%.3f)", rect.getLayoutX(), rect.getLayoutY()));
    }


}
