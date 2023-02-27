
package Part2;

public class Test {

     public static void main(String[] args) {
        
        System.out.println("Object 1:");
        
        Movable s1 = new MovablePoint(2,5,6,9) {};
        
        System.out.println(s1);
        s1.moveDown();
        System.out.println(s1);
        
        System.out.println("____________________________________________");
        
        System.out.println("Object 2:");
        
        Movable s2 = new MovableCircle(2,5,6,9,12);
        
        System.out.println(s2);
        s2.moveLeft();
        System.out.println(s2);
    }
}