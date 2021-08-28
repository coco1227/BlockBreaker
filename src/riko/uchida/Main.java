package riko.uchida;

import processing.core.PApplet;

public class Main extends PApplet {
    Stage stg=new Stage();
    public void settings(){
        size(500, 500);
    }
    public void draw(){
        stg.update();
        stg.draw();
    }

    class Ball {
        int x;
        int y;
        int dx ;
        int dy;
        Ball(){
            x=250;
            y=50;
            dx = 1;
            dy= 1;
    }


        public void update(){
            x = x +dx;
            y = y +dy;

            if(x>width || x<0)dx *= -1;
            if(y>480 || y+dy<0)dy *= -1;
        }
        public void draw(){
            strokeWeight(10);
            stroke(255);
            point(x,y);
        }
    }

    class Stage{
        Ball ball = new Ball();
        Paddle paddle = new Paddle();
        public void draw(){
            background(128);
            ball.draw();
            paddle.draw();
        }
        public void update(){
            ball.update();
            paddle.update();
        }
    }

    class Paddle{
        int x;
        int y;
        public void draw(){

        }
        public void update(){

        }
    }

    public static void main(String[]args){
        PApplet.main(Main.class);
    }
}
