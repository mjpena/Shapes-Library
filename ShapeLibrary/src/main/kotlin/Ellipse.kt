/**
 * @constructor Creates Ellipse given a point and two radii.
 */
open class Ellipse(point: Point, radius1: Double, radius2: Double): Shape(listOf(point)) {
    var radius1: Double = radius1
        private set
    var radius2: Double = radius2
        private set

    // verify area not 0
    init
    {
        if (radius1 < 0.0 || radius2 < 0.0)
        {
            throw Exception("Radii cannot be less than 0")
        }

        if (this.getArea() == 0.0)
        {
            throw Exception("Area cannot be 0")
        }
    }

    override fun getArea(): Double
    {
        return radius1 * radius2 * kotlin.math.PI
    }
}