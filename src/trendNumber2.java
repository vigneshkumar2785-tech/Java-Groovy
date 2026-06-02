import java.util.Scanner;

public class trendNumber2 {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numStr = String.valueOf(n);
        int count = numStr.length();

        if(count % 2 == 0) {
            System.out.println("Invalid number");
        }
        else {
            int midIndex = count / 2;
            int midDigit = Character.getNumericValue(numStr.charAt(midIndex));

            if(midDigit == 3) {
                System.out.println("Trending Number");
            }
            else {
                System.out.println("Not trending ");
            }
        }
    }
}
