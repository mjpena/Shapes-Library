/**
 * @param point1: First point to define this rectangle.
 * @param point2: Second point to define this rectangle.
 */
class Rectangle(point1: Point, point2: Point): Shape()
{
    // verify area is greater than 0
    init
    {
        points = listOf(point1, point2)
        if (this.getArea() == 0.0){
            throw Exception("Area cannot be 0.");
        }
    }

    override fun getArea(): Double
    {
        // get length
        val length: Double =
            if (points[1].x > points[0].x)
            {
                points[1].x - points[0].x
            } else{
                points[0].x - points[1].x
            }

        // get height
        val height: Double =
            if (points[1].y > points[0].y)
            {
                points[1].y - points[0].y
            } else{
                points[0].y - points[1].y
            }

        return length * height
    }
}