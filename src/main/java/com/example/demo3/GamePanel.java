package com.example.demo3;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {
    // Screen settings
    public static final int ORIGINAL_TILE_SIZE = 16;
    public static final int SCALE = 3;
    public static final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE; // 48x48 tile

    public static final int MAX_SCREEN_COL = 16;  // Columns on screen
    public static final int MAX_SCREEN_ROW = 12;  // Rows on screen
    public static final int SCREEN_WIDTH = TILE_SIZE * MAX_SCREEN_COL; // 768 pixels
    public static final int SCREEN_HEIGHT = TILE_SIZE * MAX_SCREEN_ROW; // 576 pixels

    // World settings
    public static final int MAX_WORLD_COL = 50;  // Total columns in the world map
    public static final int MAX_WORLD_ROW = 50;  // Total rows in the world map

    public static final int FPS = 60;  // Frames per second

    // Managers and handlers
    public final TileManager tileManager = new TileManager(this);
    public final KeyHandler keyHandler = new KeyHandler();
    public final Sound music = new Sound();
    public final Sound soundEffect = new Sound();

    public final CollisionChecker collisionChecker = new CollisionChecker(this);
    public final AssetSetter assetSetter = new AssetSetter(this);
    public final UI ui = new UI(this);

    // Entities and objects
    public final Player player = new Player(this, keyHandler);
    public final SuperObject[] objects = new SuperObject[10];

    public final Canvas canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
    public final GraphicsContext gc = canvas.getGraphicsContext2D();
    public Object gameThread;

    public TileManager tileM;
    public SuperObject[] obj;
    public CollisionChecker cChecker;// Declare the array for objects


    // Constructor
    public GamePanel() {

    }

    // Call set object method from AssetSetter class
    public void setupGame(GraphicsContext gc) {

    }

    // Start the game loop
    public void startGameThread() {

    }

    // Update game logic
    public void update() {

    }

    // Render the game components
    public void render() {

    }



    // Music and sound effects
    public void playMusic(int index) {

    }

    public void stopMusic() {

    }

    public void playSE(int index) {

    }


    @Override
    public void run() {

    }
}
