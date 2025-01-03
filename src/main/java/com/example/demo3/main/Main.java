package com.example.demo3.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        GamePanel gamePanel = new GamePanel();
        Scene scene = new Scene(gamePanel.getParent());

        primaryStage.setTitle("JavaFX Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        gamePanel.startGameThread();
    }

    public static void main(String[] args) {
        launch(args);
    }
}