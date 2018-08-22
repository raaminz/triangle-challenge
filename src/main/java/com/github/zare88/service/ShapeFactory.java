package com.github.zare88.service;

import com.github.zare88.model.shape.Shape;
import com.github.zare88.model.shape.triangle.EquilateralTriangle;
import com.github.zare88.model.shape.triangle.IsoscelesTriangle;
import com.github.zare88.model.shape.triangle.ScaleneTriangle;

import java.util.Objects;

/**
 * @author ramin zare
 */
public class ShapeFactory {
    private static ShapeFactory ourInstance = new ShapeFactory();

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        return ourInstance;
    }

    public Shape makeNewShape(int[] sides) {
        Objects.requireNonNull(sides);
        if (sides.length != 3) {
            return new Shape() {
                @Override
                public String name() {
                    return "Not Implemented Yet";
                }
            };
        } else {
            int x = sides[0];
            int y = sides[1];
            int z = sides[2];

            //It means it's not a triangle shape
            if (x <= 0 || y <= 0 || z <= 0) {
                return new Shape.NonShape();
            } else if (x == y && y == z) {
                //All of sides are equal
                return new EquilateralTriangle(x, y, z);
            } else if (x >= y + z || z >= x + y || y >= x + z) {
                //It's not a Triangle at all
                return new Shape.NonShape();
            } else if (x == y || y == z || z == x) {
                //at lease two sides are equal
                return new IsoscelesTriangle(x, y, z);
            } else {
                //it has different sides
                return new ScaleneTriangle(x, y, z);
            }
        }

    }
}
