package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Player extends Entity {
    public int worldX, worldY;

    public Rectangle solidArea;
    public int solidAreaDefaultX, solidAreaDefaultY;
    GamePanel gp;
    KeyHandler keyH;
    int x;
    int y;

    public int hasKey = 0;


    public Player(GamePanel gp, KeyHandler keyH) {


    }


    // Set default values for player
    public void setDefaultValues() {

    }

    // Load player images (only once)
    private void loadPlayerImages() {

    }

    public void update() {

    }

    public void pickUpObject(int i) {

    }

    public void draw(GraphicsContext g2) {

    }
}
