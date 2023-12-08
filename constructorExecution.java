class aero1 {
    int a,b;
    public aero1(){
        System.out.println("Parent class constructor");
    }
    public aero1(int x,int y){
        System.out.println("parameteized parent class constructor");
        a=x;
        b=y;
    }
}
class aero2 extends aero1{
    int m,n;
    public aero2(){
        //super(); //by default super() methed include hota hai it calls another (parent class)constructor
        System.out.println("child class constructor");
    }
    //super() kis vajah se pehle parent class class ho raha h
    public aero2(int x,int y){
        //super();
        System.out.println("parameterized child class constructor");
        m=x;
        n=y;
    }

}
public class constructorExecution {
    public static void main(String[] args) {
        // a=new aero2(); //constructer class
        aero2 a2= new aero2(10,20);
    }
}
