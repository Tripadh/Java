public class constucter1 {
        // ===============================
    // 1. Instance variables (data members)
    // ===============================
    int id;
    String name;
    static String college;

    // ===============================
    // 2. Static block
    // Runs ONCE when class is loaded
    // ===============================
    static {
        college = "ABC Engineering College";
        // Static block is executed before any object is created
    }

    // ===============================
    // 3. Default Constructor (No-arg)
    // ===============================
    constucter1() {
        // This constructor is called when no arguments are passed
        id = 0;
        name = "Not Assigned";

        System.out.println("Default Constructor Called");
    }

    // ===============================
    // 4. Parameterized Constructor
    // ===============================
    constucter1(int id, String name) {
        // this.id → instance variable
        // id → parameter
        this.id = id;
        this.name = name;

        System.out.println("Parameterized Constructor Called");
    }

    // ===============================
    // 5. Constructor Chaining using this()
    // ===============================
    constucter1(int id) {
        // this() calls another constructor in the SAME class
        this(id, "Unknown");   // must be FIRST line

        System.out.println("Constructor Chaining Happened");
    }

    // ===============================
    // 6. Normal Method (NOT a constructor)
    // ===============================
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    // ===============================
    // 7. Main method (program starts here)
    // ===============================
    public static void main(String[] args) {

        // Object 1 → Calls Default Constructor
        constucter1 s1 = new constucter1();
        s1.display();

        System.out.println("--------------------");

        // Object 2 → Calls Parameterized Constructor
        constucter1 s2 = new constucter1(101, "Rahul");
        s2.display();

        System.out.println("--------------------");

        // Object 3 → Calls Constructor Chaining
        constucter1 s3 = new constucter1(102);
        s3.display();
    }
}
