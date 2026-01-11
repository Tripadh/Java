public class this1 {
        int age;

    void setAge(int age) {
        this.age = age;   // 'this.age' refers to object variable
    }

    void showAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        this1 s = new this1();
        s.setAge(20);
        s.showAge();
    }
}


