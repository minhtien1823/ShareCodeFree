/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Part3;

/**
 *
 * @author mac
 */
public class Test {

   
    public static void main(String[] args) {
        System.out.println("Object 1: ");
        GeometricObject s1;
        s1 = new Circle(3.0) {
            @Override
            public void resize(int i) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        
        System.out.println("Perimeter value: " + s1.getPerimeter());
        System.out.println("Area value: " + s1.getArea());
        
        System.out.println("____________________________________________");
       
        System.out.println("Object 2: ");
        GeometricObject s2 = new ResizableCircle(6.0);
        s2.resize(20);
        
        System.out.println("____________________________________________");
        System.out.println("Object 3: ");
        GeometricObject s3 = (GeometricObject) s2;
        System.out.println("Perimeter value: " + s3.getPerimeter());
        System.out.println("Area value: " + s3.getArea());
    }
}

