package inhertiance;

public class main extends advcal{
    public static void main(String[] args) {
        calc obj1=new calc();
        advcal obj2=new advcal();
        int a=10;
        int b=5;
        obj1.add(a, b);
        obj1.sub(a, b);
        obj1.mul(a, b);
        obj1.div(a, b);
        obj2.mod(a, b);
        obj2.square(a);
        obj2.cube(a);
    } 
}
