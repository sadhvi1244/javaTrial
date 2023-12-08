class Student{
    private int age; //private variable syf same class me access ho skte h
    private String name;

    public void setData1(int a){ //ye use kiye hai taki niche age aur name na likhna pade
        age = a;
    }
    public void setData2(String n){ //ye use kiye hai taki niche age aur name na likhna pade
        name = n;
    }

    public void show(){
        System.out.println(name + " " + age); //name default value null and age default value is 0
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData1(20);
        obj.setData2("Sadhvi");
        obj.show();
    }
}
