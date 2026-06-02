public class AbsoluteDifferencePrime {
public  static boolean isPrime(int n)
{
    if(n<=1)
    {
        return false;
    }
    for(int i = 2; i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        int[] arr = {5, 5, 16, 22, 5, 3};
        int maxvalue = Integer.MIN_VALUE;
        int minvalue = Integer.MAX_VALUE;

        for (int num : arr) {
            if(isPrime(num)) {
                if (num < minvalue) {
                    minvalue = num;
                }
                if (num > maxvalue) {
                    maxvalue = num;
                }
            }
        }
        if (minvalue == Integer.MAX_VALUE) {
            System.out.println("Invalid");
        } else {
            System.out.println("Max Prime-value " + maxvalue);
            System.out.println("Min Prime-value "+minvalue);
            System.out.println("The Difference is " + (maxvalue - minvalue));
        }
    }
}
