import java.util.*;
public class Arrays {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int[] arr = new int[size];

       //Input
       for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
       }
       //Output
       for(int i=0; i<size; i++){
        System.out.print(arr[i] + " ");
   }
    }
}
