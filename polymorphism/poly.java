package polymorphism;
class aeroplane1{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){ //overridden
        System.out.println("Aeroplane is fling");
    }
}
class cargoplane1 extends aeroplane1 {
    public void takeoff(){  //overriding  (as a child hme method ko modify krna hai to hm fir se vo method likhege to usko overring kehtee hai)

        System.out.println("cargoplane requires lower rumway");
    }
    public void fly(){
        System.out.println("Cargoplane flies at lower height ");
    }
}
class passengerplan1 extends aeroplane1 {
    public void takeoff() {  //overriding
        System.out.println("passengerplan requires medium size runway");
    }
    public void fly(){  //specialize method (isko hm specialized method isliye kehte hai kyuki aise method jo main class se inherit hot to hai per hme usme kuch new mwthod add krna ho class to vo secialize methos kehlati hai)
        System.out.println("Passengerplane flies at medium height");
    }
}

public class poly {
    public static void main(String[] args) {
        cargoplane1 cp = new cargoplane1();
        //cp.takeoff();
        //cp.fly();

        passengerplan1 pp = new passengerplan1();
        //pp.takeoff();
        //pp.fly();

        aeroplane1 ref; //ref is reference variable

        //pp=cp; //not possible

        ref=cp;  //parent class ke referance pass ye capacity hoti hai chaild class ke object hold krne ki

        ref.takeoff();
        ref.fly();
        System.out.println("-------------------");

        ref=pp;

        ref.takeoff();
        ref.fly();

    }
}