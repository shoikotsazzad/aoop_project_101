package com.example.demo3;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a GamePanel and its Canvas (replacing JPanel from Swing)
        GamePanel gamePanel = new GamePanel();

        // Create a Canvas to hold the game render and graphics
        Canvas canvas = new Canvas(gamePanel.getWidth(), gamePanel.getHeight());
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Add the Canvas to the root container (StackPane)
        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        // Set up the Scene with the root container
        Scene scene = new Scene(root, gamePanel.getWidth(), gamePanel.getHeight());

        // Set the Stage (window) properties
        primaryStage.setTitle("2D Adventure");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        // Setup the game and start the game thread
        gamePanel.setupGame(gc);
        gamePanel.startGameThread();
    }
}
