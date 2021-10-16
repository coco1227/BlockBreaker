package riko.uchida;

import processing.core.PApplet;

class Ball extends DrawObject {
    int dx;
    int dy;

    Ball() {
        super(250, 50);
        x = 250;
        y = 50;
        dx = 1;
        dy = 1;
    }


    @Override
    public void update(PApplet pApplet) {
        x = x + dx;
        y = y + dy;

        if (x > pApplet.width || x < 0) dx *= -1;
        if (y > 480 || y + dy < 0) dy *= -1;
    }


    @Override
    public void draw(PApplet pApplet) {
        pApplet.strokeWeight(10);
        pApplet.stroke(255);
        pApplet.point(x, y);
    }

    @Override
    public void onAction(int x, int y) {
        this.dy = this.dy*-1;
    }
}
