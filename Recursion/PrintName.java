package Recursion;
import java.util.*;;
public class PrintName {
    static void function(int i, int n){
        if(i>n)
            return;
        System.out.println("Ananya");
        function(i+1, n);    
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        function(1,n);
    }
}
