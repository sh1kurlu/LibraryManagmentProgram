package week03.geometry;

public class Point {
    private float x,y;
     
    public Point(){
      
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public void translate(float dX, float dY){
        this.x = this.x + dX;
        this.y = this.y + dY;
    }

    public float distance(Point p){
        float dx = this.x - p.x;
        float dy = this.y - p.y;
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return (float)distance;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Point otherPoint = (Point) obj;
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public Point clone() {
    try {
        Point cloned = (Point) super.clone();
        cloned.x = this.x;
        cloned.y = this.y;
        return cloned;
    } catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
}
}

    
    



