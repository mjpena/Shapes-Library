import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

internal class EllipseTest {

    @Test
    fun testAreaZero()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = 0.0
        val radius2: Double = 3.0
        assertThrows<Exception>
        {
            val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        }
    }

    @Test
    fun testAreaZero2()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = 3.0
        val radius2: Double = 0.0
        assertThrows<Exception>
        {
            val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        }
    }

    @Test
    fun testAreaRadiusNegative()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = 3.0
        val radius2: Double = -1.0
        assertThrows<Exception>
        {
            val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        }
    }

    @Test
    fun testAreaRadiusNegative2()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = -3.0
        val radius2: Double = 1.0
        assertThrows<Exception>
        {
            val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        }
    }

    @Test
    fun testPositiveInfinity()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = Double.POSITIVE_INFINITY
        val radius2: Double = Double.POSITIVE_INFINITY
        val ellipse: Ellipse = Ellipse(point, radius1, radius2)
    }

    @Test
    fun testNan()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = Double.NaN
        val radius2: Double = Double.NaN
        assertThrows<Exception>
        {
            val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        }
    }

    @Test
    fun testGetAttributes()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = 3.0
        val radius2: Double = 1.0
        val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        assertTrue(ellipse.points[0] == point)
        assertTrue(ellipse.radius1 == radius1)
        assertTrue(ellipse.radius2 == radius2)
    }

    @Test
    fun testGetArea()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = 3.0
        val radius2: Double = 1.0
        val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        assertTrue(ellipse.getArea() == 3.0 * 1.0 * kotlin.math.PI)
    }

    @Test
    fun testGetAreaNegativePoint()
    {
        val point: Point = Point(-1.0, -5.0)
        val radius1: Double = 3.0
        val radius2: Double = 1.0
        val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        assertTrue(ellipse.getArea() == 3.0 * 1.0 * kotlin.math.PI)
    }

    @Test
    fun testMoveZero()
    {
        val point: Point = Point(1.0, 5.0)
        val radius1: Double = 3.0
        val radius2: Double = 1.0
        val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        val deltaX: Double = 0.0
        val deltaY: Double = 0.0
        ellipse.move(deltaX, deltaY)
        assertTrue(ellipse.points[0].x == 1.0)
        assertTrue(ellipse.points[0].y == 5.0)
        assertTrue(ellipse.radius1 == radius1)
        assertTrue(ellipse.radius2 == radius2)
    }

    @Test
    fun testMovePositive()
    {
        val point: Point = Point(1.0, 5.0)
        val radius1: Double = 3.0
        val radius2: Double = 1.0
        val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        val deltaX: Double = 5.0
        val deltaY: Double = 3.0
        ellipse.move(deltaX, deltaY)
        assertTrue(ellipse.points[0].x == 1.0 + deltaX)
        assertTrue(ellipse.points[0].y == 5.0 + deltaY)
        assertTrue(ellipse.radius1 == radius1)
        assertTrue(ellipse.radius2 == radius2)
    }

    @Test
    fun testMoveNegative()
    {
        val point: Point = Point(1.0, 5.0)
        val radius1: Double = 3.0
        val radius2: Double = 1.0
        val ellipse: Ellipse = Ellipse(point, radius1, radius2)
        val deltaX: Double = -5.0
        val deltaY: Double = -3.0
        ellipse.move(deltaX, deltaY)
        assertTrue(ellipse.points[0].x == 1.0 + deltaX)
        assertTrue(ellipse.points[0].y == 5.0 + deltaY)
        assertTrue(ellipse.radius1 == radius1)
        assertTrue(ellipse.radius2 == radius2)
    }
}