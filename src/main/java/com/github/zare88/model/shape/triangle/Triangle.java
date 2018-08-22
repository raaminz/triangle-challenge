package com.github.zare88.model.shape.triangle;

import com.github.zare88.model.shape.Shape;

/**
 * @author ramin zare
 */
public abstract class Triangle implements Shape {
    private int x;
    private int y;
    private int z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
