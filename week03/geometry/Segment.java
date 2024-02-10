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
    public void translate(float dX, float dY){
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }
    public float length() {
        return p1.distance(p2);
    }
    public boolean equals(Segment s){
        return this.p1.equals(s.getp1()) && this.p2.equals(s.getp2());
    }
    public float getSlope(){
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }
    public float getIntercept(){
        float slope = getSlope();
        return p1.getY() - slope * p1.getX();
    }
    public boolean isOnLine(Point p) {
        return p.getY() == getSlope() * p.getX() + getIntercept();
    }
    public boolean isOnSegment(Point p) {
        if (!isOnLine(p)) return false;

        float minX = Math.min(p1.getX(), p2.getX());
        float maxX = Math.max(p1.getX(), p2.getX());
        float minY = Math.min(p1.getY(), p2.getY());
        float maxY = Math.max(p1.getY(), p2.getY());
        
        return p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }
}