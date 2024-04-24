package org.example.Points;

public class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void info() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
