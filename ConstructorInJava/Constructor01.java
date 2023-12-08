package ConstructorInJava;

class Demo{
    private int a;
    private int b;

    // BTS(behind the scene) default constructor created by java by itself with zero or no parameters
    //publc Demo(){

    //}
    //this is a constructor
    public Demo(){
        System.out.println("Zero parameterized constructor by programmer");
    }
    public Demo(int a, int b){
        this.a=a;
        this.b=b;
    }

    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Constructor01 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.disp();
        //yaha dekho bina constructor banai hm object call krr pa rahe h koi error bhi show nhi ho rahi h
        //kyuki java apne aap default constructor bna leta h
        //d.add();
        Demo d2 =new Demo(10,20);
        d2.disp();
        //ye error isiliye show ho rahi hai kyuki default constructor me parameters nhi hote hai
        //but yaha hm jo object create krr rahe hai usme parameters likha hai isliye error show ho raha hai
        //to ab iske liye hme constructor bnana hoga

        //bhai ab achanak se default constructor ke object creation  me error aa gya

        //
    }
}
