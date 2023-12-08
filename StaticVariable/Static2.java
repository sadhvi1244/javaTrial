package StaticVariable;

class demo1 {
    static int a; // Static variable
    static int b; // Static variable

    int m; // Non-static variable
    int n; // Non-static variable

    static { // Static block to initialize static variables
        System.out.println("Control in static block");
        a = 10;
        b = 5;
    }

    { // Initialization block for instance variables
        System.out.println("Control in non-static block");
        m = 15;
        n = 6;
    }

    static void disp1() { // Static method
        System.out.println("Inside static method disp1");
    }
}

public class Static2 {
    public static void main(String[] args) {
        // Access static variables
        System.out.println("Value of a: " + demo1.a);
        System.out.println("Value of b: " + demo1.b);

        // Create an instance of demo1
        demo1 obj = new demo1();

        // Access instance variables
        System.out.println("Value of m: " + obj.m);
        System.out.println("Value of n: " + obj.n);

        // Call the static method
        demo1.disp1();
    }
}
