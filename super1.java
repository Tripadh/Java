public class super1 {
   
    String name = "Animal";

    super1() {
        // Parent class constructor
        System.out.println("Animal constructor called");
    }

    void sound() {
        // Parent class method
        System.out.println("Animal makes sound");
    }
}

class Dog extends super1 {

    String name = "Dog";

    Dog() {
        super();  
        // super() calls the parent (Animal) constructor
        // It MUST be the first line in constructor

        System.out.println("Dog constructor called");
    }

    void display() {

        System.out.println(name);
        // name → refers to current class (Dog) variable

        System.out.println(this.name);
        // this.name → explicitly refers to Dog's variable

        System.out.println(super.name);
        // super.name → refers to parent class (Animal) variable
    }

    void sound() {
        super.sound();
        // Calls Animal's sound() method

        System.out.println("Dog barks");
        // Child class behavior
    }
}



