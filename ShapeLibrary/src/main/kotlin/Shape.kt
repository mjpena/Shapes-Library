
/**
 * Abstract Shape superclass
 * @property points List of points that define this shape.
 * @constructor Accepts list of points.
 */
open abstract class Shape(points: List<Point>): Movable {
    var points: List <Point> = points
        private set

    /**
     * Calculates the area of this shape.
     * @return The area of this shape.
     */
    abstract fun getArea(): Double

    override fun move(deltaX: Double, deltaY: Double){
        for (point in points){
            point.move(deltaX, deltaY)
        }
    }
}