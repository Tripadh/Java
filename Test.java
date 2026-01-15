class Animal {

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    public void makeSound1() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {

    public void meow() {
        System.out.println("Meow");
    }
}

public class Test {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.makeSound1();   // Woof
        myDog.makeSound();    // Some generic animal sound

        Cat myCat = new Cat();
        myCat.meow();         // Meow
        myCat.makeSound();    // Some generic animal sound
    }
}
