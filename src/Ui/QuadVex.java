package Ui;

import processing.core.PApplet;

public class QuadVex {
    PApplet app;

    public QuadVex(PApplet _app){
        app = _app;
        init();
    }

    private void init(){

    }

    private float randomFactor(){
        return app.random(-50,50);
    }

    public void paint(){
        app.noFill();
        app.strokeWeight(app.random(0,1));
        app.stroke(app.random(100,200));

        float rFactor = 0.2f;
        float yTop = app.random(0,app.height/3);
        float yMid = app.random(app.height/3,(app.height/3)*2);
        float yBut = app.random((app.height/3)*2,app.height);

        app.pushMatrix();
        app.rotate(app.random(-rFactor,rFactor));
        app.translate(0, yTop);
        app.beginShape();
        app.curveVertex(0, yTop + randomFactor()); // the first control point
        app.curveVertex(0, yTop + randomFactor()); // is also the start point of curve
        app.curveVertex(app.random(0, app.width/16), yTop + randomFactor());
        app.curveVertex(app.random(0, app.width/16),  yTop + randomFactor());
        app.curveVertex(app.random((app.width/16)*8, (app.width/16)*8),  yTop +randomFactor());
        app.curveVertex(app.random((app.width/16)*8, (app.width/16)*8),  yTop + randomFactor());
        app.curveVertex(1280,  yTop + randomFactor());
        app.curveVertex(1280,  yTop + randomFactor());
        app.endShape();
        app.popMatrix();


        app.strokeWeight(app.random(0,1));
        app.stroke(app.random(100,200));


        app.pushMatrix();
        app.rotate(app.random(-rFactor,rFactor));
        app.translate(0, yMid);
        app.beginShape();
        app.curveVertex(0, yMid + randomFactor()); // the first control point
        app.curveVertex(0, yMid + randomFactor()); // is also the start point of curve
        app.curveVertex(app.random(0, app.width/4), yMid + randomFactor());
        app.curveVertex(app.random(0, app.width/4),  yMid + randomFactor());
        app.curveVertex(app.random((app.width/4)*2, (app.width/4)*3),  yMid +randomFactor());
        app.curveVertex(app.random((app.width/4)*2, (app.width/4)*3),  yMid + randomFactor());
        app.curveVertex(1280,  yMid + randomFactor());
        app.curveVertex(1280, yMid + randomFactor());
        app.endShape();
        app.popMatrix();


        app.strokeWeight(app.random(0,1));
        app.stroke(app.random(100,200));

        app.pushMatrix();
        app.rotate(app.random(-rFactor,rFactor));
        app.translate(0, yBut);
        app.beginShape();
        app.curveVertex(0,yBut + randomFactor()); // the first control point
        app.curveVertex(0, yBut + randomFactor()); // is also the start point of curve
        app.curveVertex(app.random(0, app.width/4), yBut + randomFactor());
        app.curveVertex(app.random(0, app.width/4), yBut + randomFactor());
        app.curveVertex(app.random((app.width/4)*2, (app.width/4)*3),  yBut +randomFactor());
        app.curveVertex(app.random((app.width/4)*2, (app.width/4)*3), yBut + randomFactor());
        app.curveVertex(1280,  yBut + randomFactor());
        app.curveVertex(1280, yBut + randomFactor());
        app.endShape();
        app.popMatrix();

    }
}

