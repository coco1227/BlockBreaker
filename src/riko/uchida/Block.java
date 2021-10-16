package riko.uchida;

import processing.core.PApplet;

public class Block extends DrawObject implements Collision{
    static int WIDTH = 30;
    static int HEIGHT = 15;

    public Block(int x, int y){
        super(x, y);
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.noStroke();
        pApplet.fill(255,255,255);
        pApplet.rect(x, y, WIDTH, HEIGHT);

    }


    @Override
    public boolean isHit(int x, int y) {
        if(this.x<x && x<(this.x + WIDTH)&&this.y<y&&y<(this.y+HEIGHT)){
            return true;
        }
        return false;
    }

    @Override
    public void onAction(int x, int y) {

    }

}
