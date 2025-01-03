package com.example.demo3.main;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class KeyHandler {
    public boolean upPressed, downPressed, leftPressed, rightPressed;

    public void keyPressed(KeyEvent e) {
        KeyCode code = e.getCode();

        if (code == KeyCode.W) {
            upPressed = true;
        }
        if (code == KeyCode.S) {
            downPressed = true;
        }
        if (code == KeyCode.A) {
            leftPressed = true;
        }
        if (code == KeyCode.D) {
            rightPressed = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        KeyCode code = e.getCode();

        if (code == KeyCode.W) {
            upPressed = false;
        }
        if (code == KeyCode.S) {
            downPressed = false;
        }
        if (code == KeyCode.A) {
            leftPressed = false;
        }
        if (code == KeyCode.D) {
            rightPressed = false;
        }
    }
}