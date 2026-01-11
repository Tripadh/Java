public class this {
        int age;

    void setAge(int age) {
        this.age = age;   // 'this.age' refers to object variable
    }

    void showAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.showAge();
    }
}


