package riko.uchida;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

class Stage {
    DrawObject ball;
    List<DrawObject> drawableObjects = new ArrayList<>();

    public Stage(PApplet pApplet) {
        ball = new Ball();
        drawableObjects.add(ball);

        Paddle paddle = new Paddle();
        drawableObjects.add(paddle);

        //ブロックを生成する処理
        int width = pApplet.width;
        int height = pApplet.height;

        int BW = Block.WIDTH;
        int BH = Block.HEIGHT;
        int BG = 5;

        int n = width/(BW+BG);
        int space = width - (BW+BG) *n +BG;

        int halfSpace = space/2;
        int startXPos = halfSpace;
        for(int i=0; i<n; i++){
            Block block = new Block(startXPos,halfSpace);
            drawableObjects.add(block);
            startXPos = startXPos + (BW+BG);
        }


    }

    public void update(PApplet pApplet) {
        for(int i = 0; i< drawableObjects.size(); i++){
            DrawObject o = drawableObjects.get(i);
            o.update(pApplet);

            if(o instanceof Collision){
                Collision collision = (Collision) o;

                if(collision.isHit(ball.x, ball.y)){
                    System.out.println("onHit");
                    ball.onAction(o.x, o.y);
                }
            }
        }
    }

    public void draw(PApplet pApplet) {
        pApplet.background(128);

        for(int i = 0; i< drawableObjects.size(); i++){
            DrawObject o = drawableObjects.get(i);
            o.draw(pApplet);
        }

    }


}
