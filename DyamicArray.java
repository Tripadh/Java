
    
import java.util.ArrayList;
import java.util.Scanner;
public class DyamicArray {
    public static void main(String1[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        char ch;

        do {
            System.out.println("*** Dynamic Array ***");
            System.out.println("Choose any option:");
            System.out.println("1. Insert element into array");
            System.out.println("2. Remove element from array");
            System.out.println("3. Clear all elements of an array");
            System.out.println("4. Do you want to know size?");
            System.out.println("5. Print elements of the dynamic array");

            int option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter element to insert:");
                    int ele = s.nextInt();
                    a.add(ele);
                    break;

                case 2:
                    System.out.println("Enter index of the element to remove:");
                    int index = s.nextInt();
                    if (index >= 0 && index < a.size()) {
                        a.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 3:
                    a.clear();
                    System.out.println("Array cleared");
                    break;

                case 4:
                    System.out.println("Size of the array is: " + a.size());
                    break;

                case 5:
                    System.out.println("Elements of the dynamic array:");
                    System.out.println(a);
                    break;

                default:
                    System.out.println("Invalid option chosen");
            }

            System.out.println("Do you want to continue (Y/y or N/n)?");
            ch = s.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        s.close();
    }
}

