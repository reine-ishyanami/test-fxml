package com.reine.test;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;

/**
 * @author reine
 */
public class MainLayout extends VBox {

    @FXML
    private Text text;

    public MainLayout() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/inner.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    public String getText() {
        return this.textProperty().get();
    }

    public void setText(String value) {
        this.textProperty().set(value);
    }

    public StringProperty textProperty() {
        return text.textProperty();
    }

    @FXML
    protected void showWelcomeText() {
        text.setText("Hello World");
    }
}
