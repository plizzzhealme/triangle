package io.github.plizzzhealme.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    public static final Double DELTA = 1e-13;

    @Test
    void calcAreaWithValidParameters() {
        assertEquals(6, Triangle.calcRightTriangleArea(3, 4), DELTA);
    }

    @Test
    void calcAreaWithInvalidParameters() {
        assertThrows(RuntimeException.class, () -> Triangle.calcRightTriangleArea(-1, 4));
    }

    @Test
    void calcPerimeterWithValidParameters() {
        assertEquals(12, Triangle.calcRightTrianglePerimeter(3, 4), DELTA);
    }

    @Test
    void calcPerimeterWithInvalidParameters() {
        assertThrows(RuntimeException.class, () -> Triangle.calcRightTrianglePerimeter(-1, 4));
    }
}
