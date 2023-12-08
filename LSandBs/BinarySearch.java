package LSandBs;
import java.util.*;
import java.io.*;

import static java.util.Arrays.binarySearch;
//Time complexity = O(logN)
//space complexity = O(1)
public class BinarySearch {
    public static int binarySearch(int[]arr,int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;

            }
        }
        return 0;
    }
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

        //function calling for bianry search
        int result = binarySearch(arr,x);
        if(result == 0){
            System.out.println("Searched elemetn is not found in an  array.");
        }
        else{
            System.out.println("Searched element is found at the location: "+result);
        }

    }
}

