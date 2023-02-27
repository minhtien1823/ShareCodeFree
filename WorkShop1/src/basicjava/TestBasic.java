package basicjava;
import java.util.Arrays;
import java.util.Scanner;
public class TestBasic {
    static Scanner sc = new Scanner(System.in);
    static int[] array;
    
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Enter array");
            System.out.println("2. Find index of an element");
            System.out.println("3. Remove an element");
            System.out.println("4. Insert an element");
            System.out.println("5. Find maximum value");
            System.out.println("6. Find minimum value");
            System.out.println("7. Find duplicate values");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            if (array == null && choice != 1) {
                System.out.println("Array not entered yet. Enter the array first.");
                continue;
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size = sc.nextInt();
                    array = new int[size];
                    System.out.println("Enter the elements of the array: ");
                    for (int i = 0; i < size; i++) {
                        array[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.print("Enter the element to find: ");
                    int element = sc.nextInt();
                    int index = Basic.findIndex(array, element);
                    System.out.println("Index of " + element + " is " + index);
                    break;
                case 3:
                    System.out.print("Enter the element to remove: ");
                    element = sc.nextInt();
                    array = Basic.removeElement(array, element);
                    System.out.println("Element removed. New array: " + Arrays.toString(array));
                    break;
                case 4:
                    System.out.print("Enter the element to insert: ");
                    element = sc.nextInt();
                    System.out.print("Enter the position to insert the element: ");
                    int position = sc.nextInt();
                    array = Basic.insertElement(array, element, position);
                    System.out.println("Element inserted. New array: " + Arrays.toString(array));
                    break;
                case 5:
                    int max = Basic.findMax(array);
                    System.out.println("Maximum value: " + max);
                    break;
                case 6:
                    int min = Basic.findMin(array);
                    System.out.println("Minimum value: " + min);
                    break;
                case 7:
                    int[] duplicates = Basic.findDuplicates(array);
                    System.out.println("Duplicate values: " + Arrays.toString(duplicates));
                    break;
                case 8:
                    flag = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
        sc.close();
    }
}