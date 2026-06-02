import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter money: ");
        int money = sc.nextInt();

        System.out.println("Enter cost per chocolate: ");
        int cost = sc.nextInt();

        System.out.println("Enter wrapper exchange rate: ");
        int wrapperRate = sc.nextInt();

        // Initial chocolates bought
        int chocolates = money / cost;
        int wrappers = chocolates;

        // Wrapper exchange loop
        while (wrappers >= wrapperRate) {
            int extra = wrappers / wrapperRate;
            chocolates += extra;
            wrappers = extra + (wrappers % wrapperRate);
        }

        System.out.println("Total chocolates: " + chocolates);
    }
}
