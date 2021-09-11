package riko.uchida;

import processing.core.PApplet;

class Stage {
    Ball ball = new Ball();
    Paddle paddle = new Paddle();

    public Stage() {
    }

    public void update(PApplet pApplet) {
        ball.update(pApplet);
        paddle.update(pApplet);
    }

    public void draw(PApplet pApplet) {
        pApplet.background(128);
        ball.draw(pApplet);
        paddle.draw(pApplet);
    }

}
