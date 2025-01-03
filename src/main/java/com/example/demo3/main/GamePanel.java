package com.example.demo3.main;

import com.example.demo3.entity.Player;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GamePanel extends Canvas implements Runnable {
    final int originalTileSize = 16;
    final int scale = 3;
    public final int tileSize = originalTileSize * scale;
    public final int maxScreenCol = 20;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize * maxScreenRow;

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    Player player = new Player(this, keyH);

    public GamePanel() {
        this.setWidth(screenWidth);
        this.setHeight(screenHeight);
        this.setFocusTraversable(true);
        this.setOnKeyPressed(keyH::keyPressed);
        this.setOnKeyReleased(keyH::keyReleased);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000 / 60;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                draw();
                delta--;
            }
        }
    }

    public void update() {
        player.update();
    }

    public void draw() {
        GraphicsContext g = this.getGraphicsContext2D();
        g.setFill(Color.BLACK);
        g.fillRect(0, 0, screenWidth, screenHeight);
        player.draw(g);
    }
}