package riko.uchida;

class Ball {
    private final Main main;
    int x;
    int y;
    int dx;
    int dy;

    Ball(Main main) {
        this.main = main;
        x = 250;
        y = 50;
        dx = 1;
        dy = 1;
    }


    public void update() {
        x = x + dx;
        y = y + dy;

        if (x > main.width || x < 0) dx *= -1;
        if (y > 480 || y + dy < 0) dy *= -1;
    }

    public void draw() {
        main.strokeWeight(10);
        main.stroke(255);
        main.point(x, y);
    }
}
