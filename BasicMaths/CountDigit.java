package BasicMaths;
import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = Count(num);
        System.out.println(result);
    }
     public static int Count(int num){
         int count = 0;
         while(num!=0){
         int LastDigit = num % 10;
         count+=1;
         num = num / 10;
         }
         return count;
     }
}
/* 
 * another way
 * public static int Count(int num){
 * int count = (int)(log10(num)+1);
 * return count;
 * }
 */