package com.github.zare88.model.shape;

public interface Shape {

    String name();

    class NonShape implements Shape {
        @Override
        public String name() {
            return "Not a shape";
        }
    }
}
