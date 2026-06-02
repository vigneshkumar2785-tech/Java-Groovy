public class SumPrimeFact {
    public static void main(String[] args) {
        int n = 40;
        int sum = 0;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }

        if (n > 1) {
            sum += n;
        }
        System.out.println(sum);
    }
}