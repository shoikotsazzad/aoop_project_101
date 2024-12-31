package com.example.demo3;



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperObject {
    public Image image; // Using JavaFX's Image instead of BufferedImage
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;


    // Method to draw the object on the screen
    public void draw(GraphicsContext gc, GamePanel gp) {

    }
}
