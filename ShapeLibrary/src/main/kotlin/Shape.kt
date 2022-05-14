
/**
 * Abstract Shape superclass
 */
open abstract class Shape {
    var points: List <Point> = listOf()
        protected set

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