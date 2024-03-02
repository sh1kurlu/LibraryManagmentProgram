package week06;
import week03.geometry.*;

public class MovableTest {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        Segment segment = new Segment(new Point(2, 2), new Point(3, 3));
        Circle circle = new Circle(new Point(4, 4), 5);
        
        Movable[] objects = {point, segment, circle};
        
        moveObjects(objects, 2, 2); 
        
        for (Movable object : objects) {
            System.out.println(object);
        }
    }
    
    public static void moveObjects(Movable[] objects, float deltaX, float deltaY) {
        for (Movable object : objects) {
            object.moveUp();
            object.moveLeft();
        }
    }
}
