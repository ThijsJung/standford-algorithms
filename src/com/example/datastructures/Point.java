package com.example.datastructures;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj){
        if (! (obj instanceof Point)){
            return false;
        }
        Point other = (Point) obj;
        if (other.getX() == this.getX() && other.getY() == this.getY()){
            return true;
        }
        return false;
    }
}
