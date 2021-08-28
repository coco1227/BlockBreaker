package riko.uchida;

class Stage {
    private final Main main;
    Ball ball;
    Paddle paddle = new Paddle();

    public Stage(Main main) {
        this.main = main;
        ball = new Ball(main);
    }

    public void draw() {
        main.background(128);
        ball.draw();
        paddle.draw();
    }

    public void update() {
        ball.update();
        paddle.update();
    }
}
