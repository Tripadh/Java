import java.util.Scanner;

public class ArrayCopy {
    public static void main(String1[] args) {
        int a1[] = new int[10];
        int a2[] = new int[a1.length];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a1.length; i++) {
            System.out.println("Enter value at index " + i + ":");
            a1[i] = s.nextInt();
        }

        // copy a1 into a2
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }

        System.out.println("Array 1 Elements:");
        for (int element : a1) {              // enhanced for loop
            System.out.print(element + "\t");
        }
        System.out.println();

        System.out.println("Array 2 Elements:");
        for (int element : a2) {              // enhanced for loop
            System.out.print(element + "\t");
        }
        System.out.println();

        s.close();
    }
}
