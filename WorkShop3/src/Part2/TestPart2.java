
package Part2;

public class TestPart2 {

    public static void main(String[] args) {
        Person person = new Person("Tien", "Phu Yen");
        System.out.println(person.toString());
        
    System.out.println("----------------------------------------------------");
    
        Student student = new Student("Tien Dep Trai", "Ho Chi Minh","SoftWare Engineer", 2 , 28300.0);
        System.out.println(student.toString());
  
    System.out.println("----------------------------------------------------");
          
          Staff staff = new Staff("IU", "KOREAN", "FPT", 99999);
          System.out.println(staff.toString());
    }
}
