package week05;


class Square extends Rectangle {
    double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    double getSide() {
        return side;
    }

    public void setSide(double side) { 
        this.side = side; 
    }

    @Override
    public void setWidth(double side) {
        super.width = side;
    }

    
    public void setLength(double side) {
        super.length = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "],width=" + width + ",length=" + length + "]]";
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }
}

public class Task12 {
    public static void main(String[] args) {
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o2.equals(o3));
    }
}