public class dyanimc_method {
    class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
class Test {
    public void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();  // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.sound();  // Outputs: Cat meows
    }
}
}
