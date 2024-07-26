package BasicMaths;
import java.util.*;
class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = Reverse(num);
        System.out.println(result);
    }
    static int Reverse(int num){
        int rev = 0;
        while(num>0){
            int LastDigit = num % 10;
            rev = (rev * 10) + LastDigit;
            num = num / 10;
        }
        return rev;

    }
}