import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

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


}