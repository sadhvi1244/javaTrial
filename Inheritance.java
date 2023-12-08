
class Car{
    public void color(){
        System.out.println("my car color is yellow");
    }
    public void speed(){
        System.out.println("my car speed is 200/hr");
    }

}

class Tata extends Car{ //extends (hme kisko extends krna hai) Car (hme kiski funcrionality leni hai parent class ki)
    @Override
    public void speed()
    {
        System.out.println("my car speed is 360/hr");
    }

    //specialized method
    public void cost() {
        System.out.println("my car cost is 25000000rs");
    }

}

public class Inheritance {
    public static void main(String[] args) {

    }
}
