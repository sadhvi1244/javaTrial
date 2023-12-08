package ConstructorInJava;

class Students1{
    private String name;
    private int age;
    //constructor with zero parameters
    public Students1(){
        System.out.println("Default constructor is called");
        name="Sadhvi";
        age=18;
    }
    //constructor with one parameters
    public Students1(String name){
        this.name=name;
        age=19;
    }
    //constructor with two parameters
    public Students1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}
//writing multiple constructor with same name but different paramerters is refers as contructor overloading
public class ConstructorOverloading {
    public static void main(String[] args) {
        Students1 st1 = new Students1();
        st1.disp();

        Students1 st2 = new Students1("Sadhvi");
        st2.disp();

        Students1 st3 = new Students1("sadhvi",19);
        st3.disp();

    }
}
