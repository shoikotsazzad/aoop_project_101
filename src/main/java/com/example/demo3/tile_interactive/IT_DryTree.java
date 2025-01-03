package com.example.demo3.tile_interactive;

import com.example.demo3.entity.Entity;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class IT_DryTree extends Entity {
    public IT_DryTree() {
        name = "Dry Tree";
        down1 = new Image("/tiles_interactive/drytree.png");
    }
    @Override
    public void update() {
        // Dry Tree specific update logic
    }
    @Override
    public void draw(GraphicsContext g) {
        g.drawImage(down1, worldX, worldY);
    }
}