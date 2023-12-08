class aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){ //overridden
        System.out.println("Aeroplane is fling");
    }
}
class cargoplane extends aeroplane {
   public void fly(){  //overriding  (as a child hme method ko modify krna hai to hm fir se vo method likhege to usko overring kehtee hai)
       System.out.println("cargoplane flies at lower high");
   }
   public void cargogoods(){
       System.out.println("Cargoplane carries goods");
   }
}
class passengerplan extends aeroplane{
    public void fly(){  //overriding
        System.out.println("passengerplan flies at lower high");
    }
    public void carryPassengers(){  //specialize method (isko hm specialized method isliye kehte hai kyuki aise method jo main class se inherit hot to hai per hme usme kuch new mwthod add krna ho class to vo secialize methos kehlati hai)
        System.out.println("Passengerplane carries goods");
    }
}

public class ProgUsingTypOfInherit {
    public static void main(String[] args) {
        cargoplane cp = new cargoplane();
        cp.takeoff();
        cp.fly();
    }
}
