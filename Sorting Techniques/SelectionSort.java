import java.util.Scanner;


public class SelectionSort {
    static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void Function(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int mini = i;
            for(int j=i; j<n-1; j++){
                if(arr[j] < arr[mini]) mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Function(arr, n);
    }
}
