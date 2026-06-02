import java.util.*;
class sample{

    public static int palindrome(int n)
    {
        int rev = 0;
        int dig;
        for(int i =0 ; n>0 ;i++) {
             dig = n % 10;
             rev = (rev * 10) + dig;
            n = n / 10;
        }
        return rev;

    }
    public static  void main(String[] args)
    {
        int n =1234;
        System.out.println(palindrome(n));


    }
}