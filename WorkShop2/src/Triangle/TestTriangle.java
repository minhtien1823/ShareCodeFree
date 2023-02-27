
package Triangle;

public class TestTriangle {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(2.0f, 3.0f);
    Triangle t2 = new Triangle(4.0f, 5.0f);

    System.out.println("Triangle 1: " + t1);
    System.out.println("Triangle 2: " + t2);

    t1.setWidth(3.0f);
    t1.setHegth(4.0f);
    t2.setWidth(5.0f);
    t2.setHegth(6.0f);

    System.out.println("Triangle 1: width = " + t1.getWidth() + ", height = " + t1.getHegth());
    System.out.println("Triangle 2: width = " + t2.getWidth() + ", height = " + t2.getHegth());
  }
}

       

