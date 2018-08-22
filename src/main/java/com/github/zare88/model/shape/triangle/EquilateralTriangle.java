package com.github.zare88.model.shape.triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public String name() {
        return "Equilateral Triangle";
    }
}
