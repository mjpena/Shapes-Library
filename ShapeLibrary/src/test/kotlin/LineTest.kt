import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

internal class LineTest
{
    @Test
    fun getLineAttributes()
    {
        val point1: Point = Point(3.0, 0.0)
        val point2: Point = Point(0.0, 0.0)
        val  line: Line = Line(point1, point2)
        assertTrue(line.points[0] == point1)
        assertTrue(line.points[1] == point2)
    }

    @Test
    fun lineLengthZero()
    {
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(0.0, 0.0)
        assertThrows<Exception>()
        {
            val  line: Line = Line(point1, point2)
        }
    }

    @Test
    fun getArea()
    {
        val point1: Point = Point(3.0, 1.0)
        val point2: Point = Point(0.0, 1.0)
        val  line: Line = Line(point1, point2)
        assertTrue(line.getArea() == 0.0)
    }

    @Test
    fun getLengthHorizontal(){
        val point1: Point = Point(-1.0, 2.0)
        val point2: Point = Point(5.0, 2.0)
        val line: Line = Line(point1, point2)
        assertTrue(line.getLength() == 6.0)
    }

    @Test
    fun getLengthVertical(){
        val point1: Point = Point(-1.0, -2.0)
        val point2: Point = Point(-1.0, -9.0)
        val line: Line = Line(point1, point2)
        assertTrue(line.getLength() == 7.0)
    }

    @Test
    fun getLengthDiagnol(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(3.0, 4.0)
        val line: Line = Line(point1, point2)
        assertTrue(line.getLength() == 5.0)
    }

    @Test
    fun getSlopePositive(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(4.0, 4.0)
        val line: Line = Line(point1, point2)
        assertTrue(line.getSlope() == 1.0)
    }

    @Test
    fun getSlopePositiveOppositePoints(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(4.0, 4.0)
        val line: Line = Line(point2, point1)
        assertTrue(line.getSlope() == 1.0)
    }

    @Test
    fun getSlopeNegative(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(-4.0, 4.0)
        val line: Line = Line(point1, point2)
        assertTrue(line.getSlope() == -1.0)
    }

    @Test
    fun getSlopeNegativeOppositePoints(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(-4.0, 4.0)
        val line: Line = Line(point2, point1)
        assertTrue(line.getSlope() == -1.0)
    }

    @Test
    fun moveZero(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(4.0, 4.0)
        val line: Line = Line(point1, point2)
        line.move(0.0, 0.0)
        assertTrue(line.points[0].x == 0.0)
        assertTrue(line.points[0].y == 0.0)
        assertTrue(line.points[1].x == 4.0)
        assertTrue(line.points[1].y == 4.0)
    }

    @Test
    fun movePositive(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(4.0, 4.0)
        val line: Line = Line(point1, point2)
        val deltaX: Double = 1.0
        val deltaY: Double = 1.0

        line.move(deltaX, deltaY)
        assertTrue(line.points[0].x == 1.0)
        assertTrue(line.points[0].y == 1.0)
        assertTrue(line.points[1].x == 5.0)
        assertTrue(line.points[1].y == 5.0)
    }

    @Test
    fun moveNegative(){
        val point1: Point = Point(0.0, 0.0)
        val point2: Point = Point(4.0, 4.0)
        val line: Line = Line(point1, point2)
        val deltaX: Double = -1.0
        val deltaY: Double = -1.0

        line.move(deltaX, deltaY)
        assertTrue(line.points[0].x == -1.0)
        assertTrue(line.points[0].y == -1.0)
        assertTrue(line.points[1].x == 3.0)
        assertTrue(line.points[1].y == 3.0)
    }
}
