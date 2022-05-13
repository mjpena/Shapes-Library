/**
 * @property x position of point object on x-axis
 * @property y position of point object on y-axis
 * @constructor creates Point object given x and y
 */
class Point(x:Double, y:Double){
    var x:Double = x
        private set
    var y:Double = y
        private  set

    /**
     * Creates new point object with the same attributes of this object.
     * @return Cloned Point object.
     */
    fun clone(): Point{
        return Point(x, y)
    }

    /**
     * Moves point according to deltaX and deltaY.
     * @param deltaX Amount to move point on x-axis.
     * @param deltaY Amount to move point on y-axis.
     */
    fun move(deltaX: Double, deltaY: Double){
        x += deltaX
        y += deltaY
    }
}
