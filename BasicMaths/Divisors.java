package BasicMaths;
import java.util.*;
public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        allDivisors(num);
    }
    static void allDivisors(int num){
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
