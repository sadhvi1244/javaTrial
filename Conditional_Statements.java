package Conditional_Statements;
import java.util.Scanner;

public class LOOPs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = 5, x2 = 3, x3 = 6, y1 = 2, y2 = 1, y3 = 4;
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

        if(m1==m2){
            System.out.println("The three points lie on a single line");
        }
        else{
            System.out.println("They do not lie on a single line");
        }


    }

}
