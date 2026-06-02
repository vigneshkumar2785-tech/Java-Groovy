import java.util.*;
public class Pencil{
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return  n*fact(n-1);
    }
    static int comb(int n,int r){
        return (fact(n)/(fact(r)*fact(n-r)));
    }
    public static void main(String [] args){
        int n = 5;
        int m = 2;
        int p = 3;
        int e = 2;
        int result=comb(n,p)*comb(m,e);
        System.out.println(result);
    }
}