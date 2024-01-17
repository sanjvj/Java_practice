import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean ans = isprime(input);
        System.out.println(ans);
    }

    static boolean isprime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            return false;
        }
        else {
            return true;
        }
    }
}
