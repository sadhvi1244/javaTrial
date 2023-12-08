class Animals{
 void sleep(){
     System.out.println("Animal need sleep");
 }
}
class monkey extends Animals{

}
class tiger extends Animals{

}
class deer extends Animals{

}
//ye sari class ak class ki perperty inherit krr rahi hai


public class hierarical {
    public static void main(String[] args) {
        tiger t=new tiger();
        t.sleep();
    }
}
