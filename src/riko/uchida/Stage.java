package riko.uchida;

import processing.core.PApplet;

class Stage {
    Ball ball;
    Paddle paddle = new Paddle();

    public Stage() {
        ball = new Ball();
    }

    public void draw(PApplet pApplet) {
        pApplet.background(128);
        ball.draw(pApplet);
        paddle.draw(pApplet);
    }

    public void update(PApplet pApplet) {
        ball.update(pApplet);
        paddle.update(pApplet);
    }
}
