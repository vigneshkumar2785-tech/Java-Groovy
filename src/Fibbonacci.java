import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {

        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fir = 0;
        int sec = 1;
        for(int i =0;i<n ;i++)
        {
            int res = fir + sec;
            fir = sec;
            sec = res;
            System.out.print(fir + " ");

        }

    }
}
