package methodovereiding;
public class main {
    public static void main(String[] args) {

        methodoverriding a1 = new methodoverriding();
        methodoverriding a2 = new Cat();

        a1.sound();  // Animal makes sound
        a2.sound();  // Cat meows (runtime decision)
    }
}