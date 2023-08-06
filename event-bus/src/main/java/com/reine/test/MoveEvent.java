package com.reine.test;

import javafx.scene.Node;

/**
 * @author reine
 */
public enum MoveEvent {
    UP {
        @Override
        public void move(Node node) {
            node.setLayoutY(node.getLayoutY() - distance);
        }
    }, DOWN {
        @Override
        public void move(Node node) {
            node.setLayoutY(node.getLayoutY() + distance);
        }
    }, LEFT {
        @Override
        public void move(Node node) {
            node.setLayoutX(node.getLayoutX() - distance);
        }
    }, RIGHT {
        @Override
        public void move(Node node) {
            node.setLayoutX(node.getLayoutX() + distance);
        }
    };

    double distance;

    public MoveEvent setDistance(double distance) {
        this.distance = distance;
        return this;
    }

    public abstract void move(Node node);
}
