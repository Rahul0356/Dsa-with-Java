import java.util.*;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input a number
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("sum is: " + sum);
    }
}
