public class do_whileloop {
    public static void main(String1[] args) {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
            i++;
        } while (i <= 50);
    }
}
