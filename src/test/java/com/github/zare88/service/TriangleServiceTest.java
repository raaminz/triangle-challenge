package com.github.zare88.service;

import com.github.zare88.model.Triangle;
import com.github.zare88.model.TriangleType;
import org.junit.Assert;
import org.junit.Test;

public class TriangleServiceTest {

    private static TriangleType test(Triangle triangle) {
        return TriangleService.getInstance().identifyType(triangle);
    }

    @Test
    public void notAShapeTest() {
        Triangle notAShape = new Triangle(0, 0, 0);
        Assert.assertTrue(test(notAShape) == TriangleType.NONE);
        notAShape = new Triangle(124, 10, 10);
        Assert.assertTrue(test(notAShape) == TriangleType.NONE);

    }

    @Test
    public void equilateralTest() {
        Triangle notAShape = new Triangle(12, 12, 12);
        Assert.assertTrue(test(notAShape) == TriangleType.EQUILATERAL);
    }

    @Test
    public void isoscelesTest() {
        Triangle notAShape = new Triangle(12, 12, 10);
        Assert.assertTrue(test(notAShape) == TriangleType.ISOSCELES);
        notAShape = new Triangle(10, 12, 12);
        Assert.assertTrue(test(notAShape) == TriangleType.ISOSCELES);
    }

    @Test
    public void scaleneTest() {
        Triangle notAShape = new Triangle(12, 13, 10);
        Assert.assertTrue(test(notAShape) == TriangleType.SCALENE);

    }
}