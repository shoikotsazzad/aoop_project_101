package com.example.demo3;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

public class Entity {

    public int worldX, worldY; // Entity's position in the world
    public int speed; // Movement speed

    // Sprites for different directions
    public Image up1, up2, down1, down2, left1, left2, right1, right2;
    public String direction; // Current direction of the entity

    // Animation control
    public int spriteCounter = 0;
    public int spriteNum = 1;

    // Collision area
    public Rectangle2D solidArea;
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collisionOn = false; // Flag to check if a collision occurred



}
