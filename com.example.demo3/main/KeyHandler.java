// src/main/java/com/example/demo3/GamePanel.java
package com.example.demo3;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class GamePanel extends Pane {
    public final int tileSize = 32; // Size of each tile
    public final int maxScreenCol = 20; // Maximum columns on screen
    public final int maxScreenRow = 15; // Maximum rows on screen
    public final int screenWidth = tileSize * maxScreenCol; // Width of the screen
    public final int screenHeight = tileSize * maxScreenRow; // Height of the screen

    public GraphicsContext gc;
    public Player player;

    public GamePanel() {
        Canvas canvas = new Canvas(screenWidth, screenHeight);
        gc = canvas.getGraphicsContext2D();
        getChildren().add(canvas);
        player = new Player(this, new KeyHandler());
    }

    public void update() {
        // Update game logic here
        player.update();
    }

    public void draw() {
        // Draw the game elements here
        player.draw(gc);
    }
}