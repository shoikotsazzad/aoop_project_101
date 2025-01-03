package com.example.demo3.tile;

import javafx.scene.canvas.GraphicsContext;

public class TileManager {
    Map map;

    public TileManager() {
        map = new Map();
    }

    public void draw(GraphicsContext g) {
        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 20; x++) {
                map.draw(g, x * 48, y * 48);
            }
        }
    }
}