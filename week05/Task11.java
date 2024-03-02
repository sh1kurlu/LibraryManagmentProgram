package week05;
import week06.Shape;

class Rectangle extends Shape implements Cloneable,Resizeable {
    double width = 1.0, length = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return length;
    }

    public void setLenght(double lenght) {
        this.length = lenght;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle [color=" + color + ", filled=" + filled + ", width=" + width + ", length=" + length + "]";
    }

    @Override
    protected Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("Error!");
        }
    }
    
    
    public void resize(double percent) {
        width += width * percent / 100;
        length += length * percent / 100;
    }
}

public class Task11 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(15,10);
        Rectangle r3 = new Rectangle(5,10);

        Rectangle r4 = r1.clone();
        Rectangle r5 = r2.clone();
        Rectangle r6 = r3.clone();

        System.out.println(r4.equals(r1));
        System.out.println(r5.equals(r6)); 
    }
}