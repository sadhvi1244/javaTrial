class Animal{
    public void eat(){
        System.out.println("Animal eats everyday");
    }
    public void age(){   //access modifiers cannot be decreased
        System.out.println("Animal age is");
    }
}
class lion extends Animal{
    public void eat(){  //override (for modification)
       System.out.println("lion hunts and eat");
   }
//   public int age(){  //it is not allowed hm agr parent class me return type void rakkhe hai to chaild me hm use change mtlb int nhhi krr skte
//       return 10;
//   }
}

public class RulesToOverride {
    public static void main(String[] args) {
        lion l=new lion();
        l.eat();
    }
}
