
package Triangle;

public class Triangle {
        
    private float width = 0.0f;
    private float heght =0.0f;

    
    public Triangle() {}
    public Triangle (float width, float hegth)
    {
    this.width = width; 
    this.heght = hegth; 
}
    public float getWidth() {
        return width;
}
    public float getHegth() {
        return heght;
    }
    public void setWidth(float width){
        this.width = width;        
    }
    public void setHegth(float hegth){
        this.heght = hegth;
    }
    @Override 
    public String toString() {
        return "Triangle(width=" + width + ", height=" + heght + "]";
    }
}
