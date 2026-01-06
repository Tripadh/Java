
    
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String name = sc.next();

        System.out.println(a);
        System.out.println(name);
        
        sc.close();
    }
}


