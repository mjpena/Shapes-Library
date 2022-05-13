package Shape

import Point

/**
 * @property points List of points that make up this object.
 */
open abstract class Shape {
    open val points: MutableList <Point> = mutableListOf<Point>()

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