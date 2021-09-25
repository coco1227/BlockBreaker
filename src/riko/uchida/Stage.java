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
        int bx = ball.x + ball.dx;
        int by = ball.y + ball.dy;

        if(paddle.isHit(bx, by)){
            ball.onAction(paddle.x, paddle.y);
        }

    }

    public void draw(PApplet pApplet) {
        pApplet.background(128);
        ball.draw(pApplet);
        paddle.draw(pApplet);
    }


}
