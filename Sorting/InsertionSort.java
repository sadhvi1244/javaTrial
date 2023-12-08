package Sorting;
//tc=O(n^2)
//sc=O(1)
import java.util.*;
import java.io.*;
public class InsertionSort {
    //implementation of insertion sort
    public static void insertionSort(int[] arr){
        for(int i= 1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 50, 25, 67, 79, 12, 15};
        //function calling
        insertionSort(arr);
        System.out.println("Sorted arrray is: ");
        System.out.println(Arrays.toString(arr));

    }
}



