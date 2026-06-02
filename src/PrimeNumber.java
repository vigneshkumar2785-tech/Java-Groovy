import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime = true;

        // Edge cases: numbers less than or equal to 1 are not prime
        if (num <= 1) {
             isPrime = false;
        } else {
            // Loop from 2 up to the square root of the number
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop early if a factor is found
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}
