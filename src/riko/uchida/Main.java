package riko.uchida;

import processing.core.PApplet;

public class Main extends PApplet {
    Stage stg=new Stage(this);
    public void settings(){
        size(500, 500);
    }
    public void draw(){
        stg.update();
        stg.draw();
    }

    public static void main(String[]args){
        PApplet.main(Main.class);
    }
}
