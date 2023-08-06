package com.reine.test;


import com.google.common.eventbus.Subscribe;
import javafx.fxml.FXML;

public class MainController {


    @FXML
    void initialize() {
        EventBusUtil.getDefault().register(this);
    }

    @Subscribe
    public void print(MoveNotifyEvent event){
        System.out.println(event);
    }




}
