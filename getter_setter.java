public class getter_setter {


    // 🔒 private data
    private int age;
    private String name;

    // ✅ setter for age
    public void setAge(int a) {
        age = a;
    }

    // ✅ getter for age
    public int getAge() {
        return age;
    }

    // ✅ setter for name
    public void setName(String n) {
        name = n;
    }

    // ✅ getter for name
    public String getName() {
        return name;
    }
}
  class Test{
    public static void main(String[] args) {
        getter_setter person = new getter_setter();
        person.setName("Alice");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
