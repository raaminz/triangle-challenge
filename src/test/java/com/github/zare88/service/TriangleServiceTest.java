package com.github.zare88.service;

import com.github.zare88.model.shape.Shape;
import com.github.zare88.model.shape.triangle.EquilateralTriangle;
import com.github.zare88.model.shape.triangle.IsoscelesTriangle;
import com.github.zare88.model.shape.triangle.ScaleneTriangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleServiceTest {

    private static Shape test(int[] sides) {
        return ShapeFactory.getInstance().makeNewShape(sides);
    }

    @Test
    public void notAShapeTest() {
        Assert.assertTrue(test(new int[]{0, 0, 0}) instanceof Shape.NonShape);
        Assert.assertTrue(test(new int[]{124, 10, 10}) instanceof Shape.NonShape);
    }

    @Test
    public void equilateralTest() {
        Assert.assertTrue(test(new int[]{12, 12, 12}) instanceof EquilateralTriangle);
    }

    @Test
    public void isoscelesTest() {
        Assert.assertTrue(test(new int[]{12, 12, 10}) instanceof IsoscelesTriangle);
        Assert.assertTrue(test(new int[]{10, 12, 12}) instanceof IsoscelesTriangle);
    }

    @Test
    public void scaleneTest() {
        Assert.assertTrue(test(new int[]{12, 13, 10}) instanceof ScaleneTriangle);
    }
}