package com.example.demo3.entity;

import com.example.demo3.main.GamePanel;
import com.example.demo3.main.KeyHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;
    public final int screenX;
    public final int screenY;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        screenX = gp.tileSize * 10;
        screenY = gp.tileSize * 7;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {
        speed = 4;
        direction = "down";
    }

    public void getPlayerImage() {
        up1 = new Image("/player/boy_up_1.png");
        up2 = new Image("/player/boy_up_2.png");
        down1 = new Image("/player/boy_down_1.png");
        down2 = new Image("/player/boy_down_2.png");
        left1 = new Image("/player/boy_left_1.png");
        left2 = new Image("/player/boy_left_2.png");
        right1 = new Image("/player/boy_right_1.png");
        right2 = new Image("/player/boy_right_2.png");
    }

    @Override
    public void update() {
        if (keyH.upPressed) {
            direction = "up";
        } else if (keyH.downPressed) {
            direction = "down";
        } else if (keyH.leftPressed) {
            direction = "left";
        } else if (keyH.rightPressed) {
            direction = "right";
        }

        // Add movement logic here
    }

    @Override
    public void draw(GraphicsContext g) {
        Image image = null;

        switch (direction) {
            case "up":
                image = up1;
                break;
            case "down":
                image = down1;
                break;
            case "left":
                image = left1;
                break;
            case "right":
                image = right1;
                break;
        }

        g.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize);
    }
}