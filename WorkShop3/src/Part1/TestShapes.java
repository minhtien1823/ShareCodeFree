
package Part1;

public class TestShapes {

    public static void main(String[] args) {

        Circle circle = new Circle(2.5, "red");
        System.out.println(circle); 

        Cylinder cylinder = new Cylinder(2.0, 4.0, "green");
        System.out.println(cylinder); 

        System.out.println("Change Color");
        
        circle.setColor("blue");
        cylinder.setColor("yellow");
        System.out.println(circle); 
        System.out.println(cylinder); 

        
        double area = circle.getArea();
        System.out.println("The area of the circle is: " + area); 

        double volume = cylinder.getVolume();
        System.out.println("The volume of the cylinder is: " + volume); 
    }
}


    
