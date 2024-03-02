package week05;

class Rectangle implements Cloneable {
    int width, height;
    
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

    @Override
    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        if(rect.width == width && rect.height == height) {       
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    protected Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("Error!");
        }
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