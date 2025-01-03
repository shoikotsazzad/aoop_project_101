package com.example.demo3.monster;

import com.example.demo3.entity.Entity;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class MON_Orc extends Entity {
    public MON_Orc() {
        name = "Orc";
        down1 = new Image("/monster/orc_down_1.png");
    }

    @Override
    public void update() {
        // Orc specific update logic
    }

    @Override
    public void draw(GraphicsContext g) {
        g.drawImage(down1, worldX, worldY);
    }
}