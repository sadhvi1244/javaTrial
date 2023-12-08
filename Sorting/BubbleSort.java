package Sorting;
//TC=O(n2) two loop
//SC=O(1) because we does not use any exta space jo bhi krr rahe h use array me krr rahe
import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            //for every iteration , we get bigest element in an array
            for(int j=0;j<arr.length-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1]= temp;

                     swapped = true;
                 }
            }
            if(!swapped){
                break;
            }
        }

    }
    public static void main(String[] args) {
       int [] arr= {20,50,10,12,45,67,90};
       //function calling
        bubbleSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));  //proper output ke liye taki array ki trf dekhe
    }
}
