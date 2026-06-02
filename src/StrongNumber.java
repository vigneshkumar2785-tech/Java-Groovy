import java.util.Scanner;

public class StrongNumber {
    public static int Factorial(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isFact(int number) {
        int original = number;
        int sum = 0;
        while(number > 0) {
            int dig = number % 10;
            sum = sum + Factorial(dig);
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isFact(num)) {
            System.out.println(num + " is Strong Number");
        }
        else {
            System.out.println("Not strong Number");
        }
    }
}
