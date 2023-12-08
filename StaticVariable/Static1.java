package StaticVariable;

public class Static1{

    static int a;   //instances varaible
    static{      //Static initialization block
        System.out.println("Static block");
        a=10;
        System.out.println(a);
    }
    {
        System.out.println("Control in non static block");
        a=10;
    }
    public static void main(String[] args) {
        System.out.println("main method");
    }
}