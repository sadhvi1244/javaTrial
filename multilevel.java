
class demo1 {
    void disp(){
        System.out.println("disp writtern in demo1 class");
    }
}
class demo2 extends demo1{   //if is use extends demo1 ka display methon inherit ho jata hai demo2 me

}

class demo3 extends demo2{ //same is bi display method hai

}
//this is called multilevel inheritance
public class multilevel{
    public static void main(String[] args) {
        demo3 d =new demo3();
        d.disp();
    }
}
