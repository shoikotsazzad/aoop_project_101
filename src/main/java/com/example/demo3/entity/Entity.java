package com.example.demo3.entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Entity {
    public String name;
    public int speed;
    public String direction;
    public Image up1, up2, down1, down2, left1, left2, right1, right2;
    public int worldX, worldY;

    // Abstract methods for subclasses to implement
    public abstract void update();
    public abstract void draw(GraphicsContext g);
}