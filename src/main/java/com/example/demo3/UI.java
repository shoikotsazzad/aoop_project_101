package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.text.DecimalFormat;

public class UI {

    private GamePanel gp;
    private Font arial_40, arial_80B;
    private Image keyImage;
    public boolean messageOn = false;
    public String message = "";
    public int messageCounter = 0;
    public boolean gameFinished = false;
    public double playTime;



    public UI(GamePanel gp) {
        this.gp = gp;


    }

    public void showMessage(String text) {

    }

    // Method to draw UI elements on the canvas
    public void draw(GraphicsContext gc) {

    }
}
