import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //Precompute
        int[] hash = new int[13];
        Arrays.fill(hash, 0);
        for(int i=0; i<n; i++){
            hash[arr[i]] += 1;
        }
        int q = sc.nextInt();
        while (q<=hash.length) {
            int num = sc.nextInt();
            System.err.println(hash[num]);
        }

    }
}
