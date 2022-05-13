import Point
import Shape
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * @param point1 First point used to define line.
 * @param point1 Second point used to define line.
 */
class Line(point1: Point, point2: Point): Shape(){
    override val points: MutableList<Point>
        get() = super.points

    init{
        if (point1.x == point2.x && point1.y == point2.y)
        {
            throw Exception("Line cannot have length 0.")
        }
        points.add(point1)
        points.add(point2)
    }

    override fun getArea(): Double{
        return 0.0
    }

    /**
     * Calculates the length of this line.
     * @return The length of this line.
     */
    fun getLength(): Double{
        return sqrt((points[1].x - points[0].x).pow(2) + (points[1].y - points[0].y).pow(2))
    }
}