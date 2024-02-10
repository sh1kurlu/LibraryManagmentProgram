package week03.geometry;

public class Segment {
    private Point p1, p2;

    public Segment(Point p1, Point p2){
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }
    public Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }
    public Point getp1(){
        return p1;
    }
    public Point getp2(){
        return p2;
    }
    public void setp1(Point pnt){
        this.p1 = pnt;
    }
    public void setp2(Point pnt){
        this.p2 = pnt;
    }
    
}