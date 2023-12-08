package Array;

public class Arrayref {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void changeArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    static void changeVal(int a){
        a = 1004;
    }

    public static void main(String[] args) {
        int a = 5;
        changeVal(a);
        System.out.println(a); //5
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;

        changeArray(arr);
        printArray(arr);
    }
}
