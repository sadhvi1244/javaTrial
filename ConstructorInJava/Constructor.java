package ConstructorInJava;
class Student{
    private String name;
    private int age;

    //this is costructor for Student
    Student(String name , int age){
        this.name=name;
        this.age=age;
    }
    //ye later inilization hai isme zada timr lgta h inilization me isiliye hm constuctor use krege🫳
     // public void setName(String name){
    //    this.name=name;
    //}
    //public void setAge(int age){
    //    this.age=age;
    //}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
public class Constructor {
    public static void main(String[] args) {
        //call to constructor
        Student st = new Student("Anushka", 12);
       // st.setName("Anushka");
       // st.setAge(12);

        String name=st.getName();
        System.out.println(name);

        int age=st.getAge();
        System.out.println(age);
    }
}
