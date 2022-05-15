import kotlin.math.sqrt

/**
 * @param point1 First point used to define triangle.
 * @param point2 Second point used to define triangle.
 * @param point3 Third point used to define triangle.
 */
class Triangle(point1: Point, point2: Point, point3: Point): Shape(listOf(point1, point2, point3))
{
    init
    {
        if (this.getArea() == 0.0)
        {
            throw Exception("Triangle cannot have area of 0.")
        }
    }

    override fun getArea(): Double
    {
        val length1 = Line(points[0], points[1]).getLength()
        val length2 = Line(points[0], points[2]).getLength()
        val length3 = Line(points[1], points[2]).getLength()
        val semiPerimeter = (length1 + length2 + length3) / 2
        return sqrt(semiPerimeter * (semiPerimeter-length1) * (semiPerimeter-length2) * (semiPerimeter-length3))
    }

}