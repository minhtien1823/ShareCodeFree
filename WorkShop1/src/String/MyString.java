
package String;

import java.util.Scanner;


public class MyString {
    public static void main(String[] args) {
        
        String fullName = inputFullName();

      
        String[] splitName = splitFullName(fullName);
        String firstName = splitName[0];
        String lastName = splitName[splitName.length-1];

   
        String capitalizedFullName = capitalizeFullName(fullName);

   
        System.out.println("Full name: " + fullName);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Capitalized full name: " + capitalizedFullName);
    }

    public static String inputFullName() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        return scan.nextLine();
    }

    public static String[] splitFullName(String fullName) {
        
        return fullName.split(" ");
    }

    public static String capitalizeFullName(String fullName) {
        
        return fullName.toUpperCase();
    }
}

