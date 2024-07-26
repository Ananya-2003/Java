package BasicMaths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Reverse(num);
    }
    static void Reverse(int num){
        int rev = 0;
        int dup = num;
        while(num>0){
            int LastDigit = num % 10;
            rev = (rev * 10) + LastDigit;
            num = num / 10;
        }
        if(dup == rev) System.out.println("True");
        else System.out.println("False");

    }
}
