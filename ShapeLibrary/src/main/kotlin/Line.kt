import Point
import Shape
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * @param point1 First point used to define line.
 * @param point1 Second point used to define line.
 */
class Line(point1: Point, point2: Point): Shape()
{
    init
    {
        if (point1.x == point2.x && point1.y == point2.y)
        {
            throw Exception("Line cannot have length 0.")
        }

        points = listOf(point1, point2)
    }

    override fun getArea(): Double
    {
        return 0.0
    }

    /**
     * Calculates the length of this line.
     * @return The length of this line.
     */
    fun getLength(): Double
    {
        return sqrt((points[1].x - points[0].x).pow(2) + (points[1].y - points[0].y).pow(2))
    }

    /**
     * Calculates the slope of this line.
     * @return The slope of this line.
     */
    fun getSlope(): Double
    {
        return (points[1].y - points[0].y) / (points[1].x - points[0].x)
    }
}