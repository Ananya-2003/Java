package BasicMaths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Reverse(num);
    }
    static void Reverse(int num){
        int sum = 0;
        int dup = num;
        while(num>0){
            int LastDigit = num % 10;
            sum = sum + (LastDigit + LastDigit + LastDigit);
            num = num / 10;
        }
        if(sum == dup) System.out.println("True");
        else System.out.println("False");

    }
}
