package ConstructorInJava;


class Students3 {
    private String name;
    private int age;

    //constructor with zero parameters
    public Students3() {
        //by default super method call ko include krte h
        super();
        System.out.println("Default constructor is called");
        name = "Sadhvi";
        age = 18;
    }

    //constructor with one parameters
    public Students3(String name) {
        this();  //then it will call the constructor with zero parameters kyuki this me bhi koi parameters nhi hai
        this.name = name;
        age = 19;
    }

    //constructor with two parameters
    public Students3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
    }

    public class ThisandSuper {
        public static void main(String[] args) {
            Students2 st1 = new Students2();
            st1.disp();

            Students2 st2 = new Students2("Sadhvi");
            st2.disp();

            Students2 st3 = new Students2("sadhvi", 19);
            st3.disp();

        }
    }
}
