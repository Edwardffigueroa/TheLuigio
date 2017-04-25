package Ui;

import java.util.ArrayList;



import processing.core.PApplet;

public class MainG implements Runnable {

    // Atributes
    private PApplet app;
    private int stage;
    private QuadVex quad;
    // Relations

    // Constructor
    public MainG(PApplet _app) {
        app = _app;
        init();
    }

    public void init() {
        stage = 0;
        quad = new QuadVex(app);
    }

    public void paint() {
        quad.paint();
    }

    // -------------------Gets &
    // Sets-----------------------------------------------
    public int getStage() {
        return stage;
    }

    public void setStage(int _stage) {
        stage = _stage;
    }

    @Override
    public void run() {
        while(true){
            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



    // End of UI Class
}
