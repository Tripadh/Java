class StaticDemo {

    //  Static Variable
    static String collegeName;

    //  Static Block
    static {
        collegeName = "ABC Engineering College";
        System.out.println("Static block executed");
    }

    //  Static Method
    static void showCollege() {
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        showCollege();
    }
}
