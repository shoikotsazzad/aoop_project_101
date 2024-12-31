package com.example.demo3;

import java.awt.image.BufferedImage;

public class Tile {

    public BufferedImage image;
    public boolean collision = false;
    public String tileType; // Add a type for better categorization (e.g., "solid", "water", "lava")
    public static final int TILE_SIZE = 48; // Tile size constant for consistency

    // Constructor to initialize the tile with an image and an optional type
    public Tile(BufferedImage image, boolean collision, String tileType) {

    }

    // Additional constructor for tiles that do not need a specific type
    public Tile(BufferedImage image, boolean collision) {

    }


}
