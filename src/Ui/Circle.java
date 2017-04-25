package Ui;

import ddf.minim.AudioBuffer;
import ddf.minim.Minim;
import ddf.minim.analysis.BeatDetect;
import processing.core.PApplet;

public class Circle {

    PApplet app;
    Minim minim;


    //---------------------------------------------

    float resolution = 260; // how many points in the circle
    float rad = 150;
    float x = 1;
    float y = 1;
    //float prevX;
    //float prevY;

    float t = 0; // time passed
    float tChange = .02f; // how quick time flies

    float nVal; // noise value
    float nInt = 1; // noise intensity
    float nAmp = 1; // noise amplitude

    boolean filled = false;

    BeatDetect beat;
    float noiser = 0;

    public Circle(PApplet _app){
        app = _app;
        beat = new BeatDetect();
    }

    public void paint(AudioBuffer mix) {

        beat.detect(mix);

        if(beat.isOnset()){
            noiser = app.random(0,app.width/2);
        }
        noiser *= 0.95;
        if(noiser  <= 0) {
            noiser = 0;
        }

        app.translate(app.width/3, app.height/2);

        if (filled) {
            app.noStroke();
            app.fill(0);
        }
        else {
            app.noFill();
            app.stroke(255);
            app.strokeWeight(5);
        }
        nInt = app.map(noiser, 0, app.width, 0.1f, 30f); // map mouseX to noise intensity
        nAmp = app.map(noiser, 0, app.height, 0.0f, 1.0f); // map mouseY to noise amplitude

        app.beginShape();
        for (float a=0; a<=app.TWO_PI; a+=app.TWO_PI/resolution) {

            nVal = app.map(app.noise( app.cos(a)*nInt+1, app.sin(a)*nInt+1, t ), 0.0f, 1.0f, nAmp, 1.0f); // map noise value to match the amplitude

            x = app.cos(a)*rad *nVal;
            y = app.sin(a)*rad *nVal;

            app.vertex(x, y);


        }
        app.endShape(app.CLOSE);

        t += tChange;
    }

}
