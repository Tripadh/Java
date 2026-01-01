 class Type_casting_Conversion {

    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Casting: int to double: " + doubleValue);

        // Explicit Casting (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Casting: double to int: " + anotherIntValue);

        // Converting String to Integer
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);
        System.out.println("String to Integer: " + parsedInt);

        // Converting Integer to String
        int num = 456;
        String strFromInt = Integer.toString(num);
        System.out.println("Integer to String: " + strFromInt);
    }
}