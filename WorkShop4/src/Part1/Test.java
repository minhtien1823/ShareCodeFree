
package Part1;


public class Test {
    public static void main(String[] args) {
        
        System.out.println("Object 1:");
        Shape s1 = new Cirlce(12, "red", true) {
            public boolean equals() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean equal() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        System.out.println(s1.toString());
        
        System.out.println("____________________________________________");
        System.out.println("Object 2:");
        Shape s2;
        s2 = new Cirlce(12, "blue", true) {
            public boolean equals() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean equal() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        s2.equals(s1);
        System.out.println(s2.equals(s1));
        
        System.out.println("____________________________________________");
        System.out.println("Object 3:");
        Shape s3 = new Rectangle(3, 4, "red", true) {
            @Override
            public double getLength() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }

            public boolean equals() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }

            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }

            @Override
            public boolean equal() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        System.out.println("Area value: " + s3.getArea());
        System.out.println("Perimeter value: " + s3.getPerimeter());
        
        System.out.println("____________________________________________");
        System.out.println("Object 4:");
        Shape s4 = new Square(3.0, "red", true) {
            @Override
            public boolean equal() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }

            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        System.out.println(s4.equals(s3));
    }
}

