package Array;

import java.util.Scanner;

public class ArrayTypes {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       // int n = sc.nextInt();
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
      //  System.out.print("enter array" + n + "elements: ");
        System.out.println("Original arr");
        printArray(arr);
        //trying to copy arr to arr_2
        int[] arr_2 = arr;
        System.out.println("Copied arr_2");
        printArray(arr_2);
        // changing some value of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("original array after changing arr_2");
        printArray(arr);
        System.out.println("copied arr_2 after changing arr_2");
        printArray(arr_2);
    }

}


