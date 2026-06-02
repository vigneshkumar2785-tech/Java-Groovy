import java.util.Scanner;

public class trendyNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>100 && n<=999)
        {
            n = n /10;
            n = n%10;
            if( n ==3)
            {
                System.out.println("Trending Number");
            }
            else {
                System.out.println("Not trending ");
            }
        }
    }
}
