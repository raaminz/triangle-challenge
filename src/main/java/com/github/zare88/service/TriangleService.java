package com.github.zare88.service;

import com.github.zare88.model.Triangle;
import com.github.zare88.model.TriangleType;

import java.util.Objects;

/**
 * @author ramin zare
 */
public class TriangleService {
    private static TriangleService ourInstance = new TriangleService();

    private TriangleService() {
    }

    public static TriangleService getInstance() {
        return ourInstance;
    }

    public TriangleType identifyType(Triangle triangle) {
        Objects.requireNonNull(triangle);
        int x = triangle.getX();
        int y = triangle.getY();
        int z = triangle.getZ();

        //It means it's not a triangle shape
        if (x <= 0 || y <= 0 || z <= 0) {
            return TriangleType.NONE;
        } else if (x == y && y == z) {
            //All of sides are equal
            return TriangleType.EQUILATERAL;
        } else if (x >= y + z || z >= x + y || y >= x + z) {
            //It's not a Triangle at all
            return TriangleType.NONE;
        } else if (x == y || y == z || z == x) {
            //at lease two sides are equal
            return TriangleType.ISOSCELES;
        } else {
            //it has different sides
            return TriangleType.SCALENE;
        }
    }
}
