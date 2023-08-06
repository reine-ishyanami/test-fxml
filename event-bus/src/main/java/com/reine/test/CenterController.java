package com.reine.test;

import com.google.common.eventbus.Subscribe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class CenterController {

    @FXML
    Rectangle rect;

    @FXML
    void onSendInfoAction(ActionEvent event) {
        EventBusUtil.getDefault().post(
                new PositionEvent(String.format("位置信息: (%.3f, %.3f)", rect.getLayoutX(), rect.getLayoutX()))
        );
    }

    @Subscribe
    public void moveRectHandler(MoveEvent moveEvent) {
        moveEvent.move(rect);
        EventBusUtil.getDefault().post(new MoveNotifyEvent(moveEvent.name()));
    }

//    public CenterController() {
//        EventBusUtil.getDefault().register(this);
//    }

    @FXML
    void initialize() {
        EventBusUtil.getDefault().register(this);
    }

}
