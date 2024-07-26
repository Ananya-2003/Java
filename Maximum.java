import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // if(a>b && a>c){
        //     System.out.println("Maximum: "+a);
        // }
        // else if(b>a && b>c){
        //     System.out.println("Maximum: "+b);
        // }
        // else{
        //     System.out.println("Maximum: "+c);
        // }
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
