import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

internal class RectangleTest {
    @Test
    fun testGetAttributes()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(1.0, 1.0)
        val rectangle: Rectangle = Rectangle(point1, point2)
        assertTrue(rectangle.points[0] == point1)
        assertTrue(rectangle.points[1] == point2)
    }
    @Test
    fun testAreaZero()
    {
        val point1: Point = Point(0.0, 0.0)
        assertThrows<Exception>
        {
            val rectangle: Rectangle = Rectangle(point1, point1)
        }
    }

    @Test
    fun testAreaZero2()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(0.0, 1.0)
        assertThrows<Exception>
        {
            val rectangle: Rectangle = Rectangle(point1, point2)
        }
    }

    @Test
    fun testAreaZero3()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(1.0, 0.0)
        assertThrows<Exception>
        {
            val rectangle: Rectangle = Rectangle(point1, point2)
        }
    }

    @Test
    fun testGetAreaPositive()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(1.0, 1.0)
        val rectangle: Rectangle = Rectangle(point1, point2)
        val rectangle2: Rectangle = Rectangle(point2, point1)
        assertTrue(rectangle.getArea() == 1.0)
        assertTrue(rectangle2.getArea() == 1.0)
    }

    @Test
    fun testGetAreaNegative()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(-1.0, -1.0)
        val rectangle: Rectangle = Rectangle(point1, point2)
        val rectangle2: Rectangle = Rectangle(point2, point1)
        assertTrue(rectangle.getArea() == 1.0)
        assertTrue(rectangle2.getArea() == 1.0)
    }

    @Test
    fun testMove()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(1.0, 1.0)
        val rectangle: Rectangle = Rectangle(point1, point2)
        val deltaX: Double = 5.3
        val deltaY: Double = -41.3
        rectangle.move(deltaX, deltaY)
        assertTrue(rectangle.points[0].x == 5.3)
        assertTrue(rectangle.points[0].y == -41.3)
        assertTrue(rectangle.points[1].x == 6.3)
        assertTrue(rectangle.points[1].y == -40.3)
    }
}