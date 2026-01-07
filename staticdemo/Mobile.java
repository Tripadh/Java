package staticdemo;
 import staticdemo.staticVarible;
public class Mobile {
    public static void main(String[] args) {
        staticVarible.name = "Smartphone"; //need to call by class name

        staticVarible mobile1 = new staticVarible();
        mobile1.brand = "Apple";
        mobile1.price = 1000;
        mobile1.show();

        staticVarible mobile2 = new staticVarible();
        mobile2.brand = "Samsung";
        mobile2.price = 800;
        mobile2.show();
    }
}