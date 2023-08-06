package com.reine.test;

import com.google.common.eventbus.Subscribe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BottomController {

    @FXML
    Label labelInfo;

    @FXML
    void onMoveDown(ActionEvent event) {
        EventBusUtil.getDefault().post(MoveEvent.DOWN.setDistance(5.0));
    }

    @FXML
    void onMoveLeft(ActionEvent event) {
        EventBusUtil.getDefault().post(MoveEvent.LEFT.setDistance(5.0));
    }

    @FXML
    void onMoveRight(ActionEvent event) {
        EventBusUtil.getDefault().post(MoveEvent.RIGHT.setDistance(5.0));
    }

    @FXML
    void onMoveUp(ActionEvent event) {
        EventBusUtil.getDefault().post(MoveEvent.UP.setDistance(5.0));
    }

    @Subscribe
    public void setInfo(PositionEvent result) {
        labelInfo.setText(result.info());
    }

    @FXML
    void initialize(){
        EventBusUtil.getDefault().register(this);
    }

//    public BottomController() {
//        EventBusUtil.getDefault().register(this);
//    }
}
