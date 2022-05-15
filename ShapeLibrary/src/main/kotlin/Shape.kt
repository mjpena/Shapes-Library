
/**
 * Abstract Shape superclass
 * @property points List of points that define this shape.
 * @constructor Accepts list of points.
 */
open abstract class Shape(points: List<Point>) {
    var points: List <Point> = points
        private set

    /**
     * Calculates the area of this shape.
     * @return The area of this shape.
     */
    abstract fun getArea(): Double

    /**
     * Moves shape according to deltaX and deltaY.
     * @param deltaX Amount to move shape on x-axis.
     * @param deltaY Amount to move shape on y-axis.
     */
    fun move(deltaX: Double, deltaY: Double){
        for (point in points){
            point.move(deltaX, deltaY)
        }
    }
}