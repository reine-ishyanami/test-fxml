package com.reine.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class BottomController {

    @FXML
    Label labelInfo;
    MainController mainController;

    @FXML
    void onMoveDown(ActionEvent event) {
        Rectangle rect = mainController.centerController.rect;
        rect.setLayoutY(rect.getLayoutY() + 5);
    }

    @FXML
    void onMoveLeft(ActionEvent event) {
        Rectangle rect = mainController.centerController.rect;
        rect.setLayoutX(rect.getLayoutX() - 5);
    }

    @FXML
    void onMoveRight(ActionEvent event) {
        Rectangle rect = mainController.centerController.rect;
        rect.setLayoutX(rect.getLayoutX() + 5);
    }

    @FXML
    void onMoveUp(ActionEvent event) {
        Rectangle rect = mainController.centerController.rect;
        rect.setLayoutY(rect.getLayoutY() - 5);
    }


}
