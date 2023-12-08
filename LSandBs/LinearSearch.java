package LSandBs;
import java.util.*;
import java.io.*;
//Time complexity = o(n)
//space complexity = o(1)
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
         //target element from user
        System.out.println("ENTER the target element: ");
        int x = sc.nextInt();

        //implementation of linear search
        int idx = -1;  //inddex var
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            System.out.println("Searched eleemtn is not found in an  array");
        }
        else{
            System.out.println("Searched element is found at the location:"+idx);
        }

    }
}
