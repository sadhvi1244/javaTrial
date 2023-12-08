class Human {
    private String name;
    int age;

    Human() {
        System.out.println("Human class constructor");
    }

    void sleep() {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human {
    void disp() {
        System.out.println("The age is: " + age);
        // You cannot access the 'name' field here since it's private in the Human class.
        // System.out.println("The name is: " + name);
    }
}

public class Inherit {
    public static void main(String[] args) {
        Student st1 = new Student();
       // st1.sleep();
        //st1.disp();
    }
}
