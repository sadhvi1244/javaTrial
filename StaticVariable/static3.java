package StaticVariable;

public class static3 {

    static int age;    //static variable

    static {     //static inilization block
        System.out.println("Static block");
        age = 17;
    }

    static void disp(){
        System.out.println("Disp static method");
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
