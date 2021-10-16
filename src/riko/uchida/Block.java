package riko.uchida;

import processing.core.PApplet;

public class Block implements Collision{
    int bx;
    int by;
    static int WIDTH = 30;
    static int HEIGHT = 15;
    public Block(int x, int y){
        bx= x;
        by = y;
    }

    public void draw(PApplet pApplet) {
        pApplet.noStroke();
        pApplet.fill(255,255,255);
        pApplet.rect(bx, by, WIDTH, HEIGHT);

    }


    @Override
    public boolean isHit(int x, int y) {
        if(this.bx<x && x<(this.bx + WIDTH)&&this.by<y&&y<(this.by+HEIGHT)){
            return true;
        }
        return false;
    }

    @Override
    public void onAction(int x, int y) {

    }

}
