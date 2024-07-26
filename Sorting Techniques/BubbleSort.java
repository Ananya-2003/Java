import java.util.Scanner;

public class BubbleSort {
    static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void Function(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Function(arr);
    }
}
