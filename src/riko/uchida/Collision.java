package riko.uchida;

public interface Collision {
    boolean isHit(int x, int y);
    void onAction(int x, int y);
}
