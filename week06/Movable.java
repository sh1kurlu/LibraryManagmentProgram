package week06;
import week03.geometry.*;
import week05.*;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Circle extends Shape implements Movable, Resizeable {
    private Point center;
    private double radius = 1.0;

    public Circle(){}

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color=" + color + ",filled=" +filled+ "],radius=" + radius + "]";
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent / 100;
    }
}
