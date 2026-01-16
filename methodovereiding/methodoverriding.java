package methodovereiding;
public class methodoverriding {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends methodoverriding {

    @Override
    void sound() {
        // Overriding parent method
        System.out.println("Cat meows");
    }
}


   

