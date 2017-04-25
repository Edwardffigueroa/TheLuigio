package Ui;

import ddf.minim.AudioBuffer;
import ddf.minim.analysis.BeatDetect;
import processing.core.PApplet;
import processing.core.PImage;

public class Bg {

    private PApplet app;
    private PImage img1,img2,img3;
    float noiser = 0;
    private BeatDetect beat;



    public Bg(PApplet _app){
        app = _app;
        beat = new BeatDetect();
        loadAssets();
    }


    private void loadAssets(){
        img1 = app.loadImage("./assets/1.jpg");
        img2 = app.loadImage("./assets/2.jpg");
        img3 = app.loadImage("./assets/3.jpg");
    }

    public void paint(AudioBuffer mix){
        beat.detect(mix);
        app.imageMode(app.CENTER);



        if(beat.isOnset()){
            noiser = app.random(150,220);
        }
        noiser *= 0.95;
        if(noiser  <= 0) {
            noiser = 0;
        }


        app.tint(255, noiser);
        app.image(img2, app.width/2, app.height/2);

    }

}
