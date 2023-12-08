package Array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[6];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        arr[5] = 4;

        System.out.println("Enter " +n+ " elements");
        for(int i = 0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for(int i = 0;i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }




    }
}
