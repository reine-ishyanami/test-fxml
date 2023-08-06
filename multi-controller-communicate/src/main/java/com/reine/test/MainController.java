package com.reine.test;


import javafx.fxml.FXML;

public class MainController {

    /**
     * 注入命名规则，需要在fxml文件中指定fx:id="xxx"，注入的controller命名为xxxController，其中xxx为fxml文件中定义的fx:id
     */
    @FXML
    BottomController bottomController;

    @FXML
    CenterController centerController;

    @FXML
    void initialize() {
        bottomController.mainController = this;
        centerController.mainController = this;
    }

}
