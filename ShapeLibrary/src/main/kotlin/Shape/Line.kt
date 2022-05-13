package Shape

import Point

/**
 * @param point1 First point used to define line.
 * @param point1 Second point used to define line.
 */
class Line(point1: Point, point2: Point): Shape(){
    override val points: MutableList<Point>
        get() = super.points

    init{
        points.add(point1)
        points.add(point2)
    }

    override fun getArea(): Double{
        return 0.0
    }
}