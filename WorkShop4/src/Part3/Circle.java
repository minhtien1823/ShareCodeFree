/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part3;

/**
 *
 * @author mac
 */
public abstract class Circle implements GeometricObject{
    protected double radius = 1.0;
    
    public Circle(double radius){
    this.radius = radius;
    }
    
    @Override
    public double getPerimeter(){
    return 2 * radius * 3.14;
    }

    @Override
    public double getArea(){
    return radius * radius * 3.14;
    }

}
