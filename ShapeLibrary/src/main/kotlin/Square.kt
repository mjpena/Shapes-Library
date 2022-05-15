class Square(point1: Point, width: Double): Rectangle(point1, point2 = Point(point1.x + width, point1.y + width))
{
    init
    {
        if (width <= 0.0){
            throw Exception("Width cannot be less than or equal to 0.")
        }
    }
}