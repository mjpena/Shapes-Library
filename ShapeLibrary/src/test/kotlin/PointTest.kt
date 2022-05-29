import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

internal class PointTest {

    @Test
    fun testZeroValue() {
        val testX = 0.0
        val testY = 0.0
        val point: Point = Point(testX, testY)
        assertTrue(point.x == testX)
        assertTrue(point.y == testY)
    }

    @Test
    fun testNaNValue() {
        val testX = Double.NaN
        val testY = Double.NaN
        assertThrows<Exception> {
            val point: Point = Point(testX, testY)
        }
    }

    @Test
    fun testPositiveInfinity() {
        val testX = Double.POSITIVE_INFINITY
        val testY = Double.POSITIVE_INFINITY
        val point: Point = Point(testX, testY)
    }

    @Test
    fun testNegativeInfinity() {
        val testX = Double.NEGATIVE_INFINITY
        val testY = Double.NEGATIVE_INFINITY
        val point: Point = Point(testX, testY)
    }

    @Test
    fun testPositiveValues() {
        val testX = 53.66
        val testY = 9.23
        val point: Point = Point(testX, testY)
        assertTrue(point.x == testX)
        assertTrue(point.y == testY)
    }

    @Test
    fun testNegativeValues() {
        val testX = -15.34
        val testY = -94.8
        val point: Point = Point(testX, testY)
        assertTrue(point.x == testX)
        assertTrue(point.y == testY)
    }

    @Test
    fun testClone() {
        val testX = -1.0
        val testY = 5.8
        val point: Point = Point(testX, testY)
        val pointClone = point.clone()
        assertTrue(pointClone.x == point.x)
        assertTrue(pointClone.y == point.y)
    }

    @Test
    fun testMoveZero() {
        val testX = 1.0
        val testY = 1.0
        val point: Point = Point(testX, testY)
        point.move(0.0, 0.0)
        assertTrue(point.x == 1.0)
        assertTrue(point.y == 1.0)
    }

    @Test
    fun testMovePositive() {
        val testX = 1.0
        val testY = 1.0
        val deltaX = 5.0
        val deltaY = 10.5
        val point: Point = Point(testX, testY)

        point.move(deltaX, deltaY)
        assertTrue(point.x == testX + deltaX)
        assertTrue(point.y == testY + deltaY)
    }

    @Test
    fun testMoveNegative() {
        val testX = 1.0
        val testY = 1.0
        val deltaX = -5.0
        val deltaY = -10.5
        val point: Point = Point(testX, testY)

        point.move(deltaX, deltaY)
        assertTrue(point.x == testX + deltaX)
        assertTrue(point.y == testY + deltaY)
    }
}