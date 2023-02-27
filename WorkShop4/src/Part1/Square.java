
package Part1;

import java.util.Objects;

public abstract class Square extends Rectangle {

    private double side;

    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        super.color = color; 
        super.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.width = width;
    }

    @Override
    public void setLength(double side) {
        super.length = length;
    }
      @Override
    public boolean equals(Object otherObj){
     
    if(this == otherObj){
        return true;
    }
    
    if(otherObj == null){
        return false;
    }
    
    if(!(this.getClass() == otherObj.getClass())){
        return false;
    }
    Square other = (Square)otherObj;
    return Objects.equals(this.side, other.side) 
            && Objects.equals(super.color, other.color)          
            && Objects.equals(super.filled, other.filled);
    }
    
    @Override
    public double getLength(){
    return getLength();
    }
}
