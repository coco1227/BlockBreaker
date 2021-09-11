package riko.uchida;

import processing.core.PApplet;

import static processing.core.PConstants.RADIUS;

class Paddle {
    int x = 255;
    int y = 450;
    int w = 50;
    int h = 10;

    public void draw(PApplet pApplet) {
        pApplet.noStroke();
        pApplet.fill(255,255,255);
        pApplet.rect(x, y, w, h);

    }

    public void update(PApplet pApplet) {
        if(pApplet.keyPressed){
            if (pApplet.keyCode == 37) x -= 5;
            if(pApplet.keyCode == 39) x += 5;
        }
    }
}
