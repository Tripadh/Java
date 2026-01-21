public class Polymorphism 
{

    void sound() {
        System.out.println("Animal sound");
    }

    void sound(String type) {
        // Method overloading (compile-time)
        System.out.println("Animal sound: " + type);
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        // Method overriding (runtime)
        System.out.println("Dog barks");
    }
}


class Animal {

    void sound() {
        System.out.println("Animal sound");
    }

    void sound(String type) {
        // Method overloading (compile-time)
        System.out.println("Animal sound: " + type);
    }
}

class Test2 {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();            // Runtime polymorphism → Dog barks
        a.sound("generic");   // Compile-time polymorphism
    }
}