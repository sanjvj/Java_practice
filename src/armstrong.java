import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean ans = isarmstrong(input);
        System.out.println(ans);
    }

    static boolean isarmstrong(int input){
        int original = input;
        int sum = 0;
        while(input>0){
            int rem = input%10;
            int newrem = rem*rem*rem;
            sum += newrem;
            input = input/10;

        }
        if(sum == original){
            return true;
        }
        else {
            return false;
        }

    }
}
