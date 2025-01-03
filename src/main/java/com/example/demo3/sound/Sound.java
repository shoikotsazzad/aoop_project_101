package com.example.demo3.sound;

import javafx.scene.media.AudioClip;

public class Sound {
    private AudioClip clip;

    /**
     * Sets the audio file to be used by this Sound object.
     *
     * @param soundFile The relative path to the audio file within the classpath.
     */
    public void setFile(String soundFile) {
        try {
            var resource = getClass().getResource(soundFile);
            if (resource == null) {
                throw new IllegalArgumentException("Audio file not found: " + soundFile);
            }
            clip = new AudioClip(resource.toString());
        } catch (Exception e) {
            System.err.println("Error setting audio file: " + e.getMessage());
            clip = null; // Ensures clip is null if an error occurs
        }
    }

    /**
     * Plays the audio clip if it is set and valid.
     */
    public void play() {
        if (clip != null) {
            clip.play();
        } else {
            System.err.println("No audio clip set or failed to load.");
        }
    }

    /**
     * Stops the audio clip if it is currently playing.
     */
    public void stop() {
        if (clip != null) {
            clip.stop();
        } else {
            System.err.println("No audio clip set or failed to load.");
        }
    }
}
