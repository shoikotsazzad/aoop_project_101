// src/main/java/com/example/demo3/Entity.java
package com.example.demo3;

import javafx.scene.image.Image;

public abstract class Entity {
    public int speed;
    public String direction;
    
    // Player images
    public Image up1, up2, down1, down2, left1, left2, right1, right2;

    // Abstract methods to be implemented by subclasses
    public abstract void update();
    public abstract void draw(GraphicsContext g);
}