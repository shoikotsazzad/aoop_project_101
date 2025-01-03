package com.example.demo3.object;

import com.example.demo3.entity.Entity;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class OBJ_Chest extends Entity {
    public OBJ_Chest() {
        name = "Chest";
        down1 = new Image("/objects/chest.png");
    }

    @Override
    public void update() {
        // Chest specific update logic
    }
    @Override
    public void draw(GraphicsContext g) {
        g.drawImage(down1, worldX, worldY);
    }
}