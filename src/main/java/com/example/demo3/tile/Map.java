package com.example.demo3.tile;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Map {
    public Image tile;

    public Map() {
        tile = new Image("/tiles/tile.png");
    }

    public void draw(GraphicsContext g, int x, int y) {
        g.drawImage(tile, x, y);
    }
}