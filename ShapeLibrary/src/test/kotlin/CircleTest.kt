import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CircleTest
{
    @Test
    fun testGetAttributes()
    {
        val point: Point = Point(0.0, 0.0)
        val radius1: Double = 3.0
        val circle: Circle = Circle(point, radius1)
        assertTrue(circle.points[0] == point)
        assertTrue(circle.radius1 == radius1)
        assertTrue(circle.radius2 == radius1)
    }
}
