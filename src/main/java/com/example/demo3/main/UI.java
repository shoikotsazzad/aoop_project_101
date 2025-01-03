package com.example.demo3.main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class UI {
    GamePanel gp;
    Font font;

    public UI(GamePanel gp) {
        this.gp = gp;
        font = new Font("Arial", 20);
    }

    public void draw(GraphicsContext g) {
        g.setFont(font);
        g.setFill(Color.WHITE);
        g.fillText("Life: 5", 10, 20);
    }
}