import java.util.Scanner;
//Using parameterized method call
public class SumOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n,0);
    }
    static void function(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        function(i-1, sum+i);
    }
}
