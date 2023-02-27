package Point.java; 

public class Point2D{
    private float x = 0.0f; 
    private double y = 0.0f;
    
    public Point2D() {}
    public Point2D (float x, double y){
    this.x = x;
    this.y = y; 
}
    public float getX() {
        return x;
    }
    public double getY() {
        return y; 
    }
}