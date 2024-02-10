package week03.geometry;

public class Segment {
    private Point p1,p2;

    public Segment(Point p1, Point p2){
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    } 

    public Point getP1(){
        return new Point(p1);
    }

    public void setP1(Point p){
        this.p1 = new Point(p);
    }

    public Point getP2(){
        return new Point (p2);
    }

    public void setP2(Point p){
        this.p2 = new Point(p);
    }

    public void translate(float dX, float dY){
        
    }


    

}
