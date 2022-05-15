import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TriangleTest {

    @Test
    fun getAttributes()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(0.0, 3.0)
        val point3: Point = Point(3.0, 3.0)
        val triangle: Triangle = Triangle(point1, point2, point3)
        assertTrue(triangle.points[0] == point1)
        assertTrue(triangle.points[1] == point2)
        assertTrue(triangle.points[2] == point3)
    }

    @Test
    fun areaZero()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(0.0, 3.0)
        val point3: Point = Point(0.0, 5.0)
        org.junit.jupiter.api.assertThrows<Exception>()
        {
            val triangle: Triangle = Triangle(point1, point2, point3)
        }
    }

    @Test
    fun getAreaPositive()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(2.0, 0.0)
        val point3: Point = Point(2.0, 2.0)
        val triangle: Triangle = Triangle(point1, point2, point3)
        val area: Double  = 2.0 * 2.0 * 0.5
        val area2: Double = triangle.getArea()
        assertEquals(area, area2, .000001)
    }

    @Test
    fun getAreaNegative()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(-2.0, 0.0)
        val point3: Point = Point(-2.0, -2.0)
        val triangle: Triangle = Triangle(point1, point2, point3)
        val area: Double  = 2.0 * 2.0 * 0.5
        val area2: Double = triangle.getArea()
        assertEquals(area, area2, .000001)
    }

    @Test
    fun testMove()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(2.0, 0.0)
        val point3: Point = Point(2.0, 2.0)
        val triangle: Triangle = Triangle(point1, point2, point3)
        val deltaX: Double = 5.3
        val deltaY: Double = -41.3
        triangle.move(deltaX, deltaY)
        assertTrue(triangle.points[0].x == 5.3)
        assertTrue(triangle.points[0].y == -41.3)
        assertTrue(triangle.points[1].x == 7.3)
        assertTrue(triangle.points[1].y == -41.3)
        assertTrue(triangle.points[2].x == 7.3)
        assertTrue(triangle.points[2].y == -39.3)
    }
}