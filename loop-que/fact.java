import java.util.Scanner;
public class fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        int fact=1;

        System.out.print("Enter a number to find its factorial: ");
        num = sc.nextInt();

        for(int i=1;i<=num;i++){
            fact *=i;
        }
        System.out.println("The factorial of " + num + " is: " + fact);
    }
}