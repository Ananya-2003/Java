import java.util.Scanner;

public class PrintNto1 {
    static void function(int i, int n){
        if(i<1)
            return;
        System.out.println(i);
        function(i-1, n);    
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        function(n, n);
    }
}
