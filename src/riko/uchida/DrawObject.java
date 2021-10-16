package riko.uchida;

import processing.core.PApplet;

/***
 * 抽象クラス
 *
 */
public abstract class DrawObject {
    int x;
    int y;

    public DrawObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void draw(PApplet pApplet);

    public void update(PApplet pApplet) {

    }

    void onAction(int x, int y){

    }
}
