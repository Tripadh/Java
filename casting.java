public class casting {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends casting {
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog-specific method");
    }
}
class castingTest {
    public static void main(String[] args) {
        casting myAnimal = new Dog(); // Upcasting

        myAnimal.sound();  // Outputs: Dog barks

        // Downcasting
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;
            myDog.bark();  // Outputs: Dog-specific method
        }
    }
}
