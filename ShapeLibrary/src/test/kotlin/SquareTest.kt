import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class SquareTest{
    @Test
    fun testGetAttributes()
    {
        val point1: Point = Point(0.0, 0.0)
        val square: Square = Square(point1, 5.0)
        assertTrue(square.points[0].x == 0.0)
        assertTrue(square.points[0].y == 0.0)
        assertTrue(square.points[1].x == 5.0)
        assertTrue(square.points[1].y == 5.0)
    }

    @Test
    fun testWidthZero()
    {
        val point1: Point = Point(3.0, 4.0)
        assertThrows<Exception>
        {
            val square: Square = Square(point1, 0.0)
        }
    }

    @Test
    fun testWidthNegative()
    {
        val point1: Point = Point(3.0, 4.0)
        assertThrows<Exception>
        {
            val square: Square = Square(point1, -3.0)
        }
    }
}