import java.math.BigInteger;
import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = last(num1,num2);
        System.out.println(ans);
    }

    static int
    last(int num1,int num2){
        int power = (int) Math.pow(num1,num2);
        int last = power%10;
        last = (int) last;

        return last;
    }
}
