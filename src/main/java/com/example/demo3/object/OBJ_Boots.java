package com.example.demo3.object;

import com.example.demo3.entity.Entity;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class OBJ_Boots extends Entity {
    public OBJ_Boots() {
        name = "Boots";
        down1 = new Image("/objects/boots.png");
    }

    @Override
    public void update() {
        // Boots specific update logic
    }

    @Override
    public void draw(GraphicsContext g) {
        g.drawImage(down1, worldX, worldY);
    }
}