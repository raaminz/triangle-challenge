package com.github.zare88.model.shape.triangle;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public String name() {
        return "Isosceles Triangle";
    }
}
