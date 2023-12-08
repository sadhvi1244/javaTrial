package BasicsOfJava;

public class IncreDecre {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x++; //x = x + 1;
        System.out.println(x);
        x--; //x=x-1;
        System.out.println(x);
        int y,z;
        y= 2;
        z= 3;
       System.out.println(y++);//2(pehle print ya kaam krta hai (x++ is "use x and then increment" ))
       System.out.println(y);//3()
        // System.out.println(++y);//6(bina print kiye update krr diya(++x is "increment x and then use "))
        //System.out.println(y);//6(fir isme ye print krr diya)
        //X-- and --X bhai same khani

    }
}
