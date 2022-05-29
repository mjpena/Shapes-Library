/**
 * @property x position of point object on x-axis
 * @property y position of point object on y-axis
 * @constructor creates Point object given x and y
 */
class Point(x:Double, y:Double): Movable{
    var x:Double = x
        private set

    var y:Double = y
        private set

    init {
        if (x.isNaN() || y.isNaN()){
            throw Exception("Point x or y attribute cannot be equal to NaN")
        }
    }

    /**
     * Creates new point object with the same attributes of this object.
     * @return Cloned Point object.
     */
    fun clone(): Point{
        return Point(x, y)
    }

    override fun move(deltaX: Double, deltaY: Double){
        x += deltaX
        y += deltaY
    }
}
