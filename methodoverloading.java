class methodoverloading {
    int add(int a, int b) {
        System.out.println("I am Integer method");
        return a + b;
    }

    float add(float a, float b, float c) {
        System.out.println("I am float method (3 args)");
        return a + b + c;
    }

    int add(int a, int b, int c) {
        System.out.println("I am Integer method (3 args)");
        return a + b + c;
    }

    float add(float a, float b) {
        System.out.println("I am float method (2 args)");
        return a + b;
    }
}

class MethodOverLoad {
    public static void main(String1[] args) {
        methodoverloading m = new methodoverloading();

        System.out.println(m.add(10, 20));                 // calls int add(int,int)
        System.out.println(m.add(10.2f, 20.4f, 30.9f));    // calls float add(float,float,float)
        System.out.println(m.add(10, 20, 30));             // calls int add(int,int,int)
        System.out.println(m.add(10.2f, 20.4f));           // calls float add(float,float)
    }
}
