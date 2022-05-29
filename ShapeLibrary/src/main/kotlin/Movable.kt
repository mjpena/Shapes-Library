interface Movable {
    /**
     * Moves object according to deltaX and deltaY.
     * @param deltaX Amount to move shape on x-axis.
     * @param deltaY Amount to move shape on y-axis.
     */
    fun move(deltaX: Double, deltaY: Double)
}