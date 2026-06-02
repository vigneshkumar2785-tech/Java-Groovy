import java.util.*;
    public class lcm{
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }
        public static int lcm(int a, int b) {
            if (a == 0 || b == 0) return 0;
            return Math.abs(a * b) / gcd(a, b);
        }
        public static void main(String [] args){
            int [] arr ={4,1,3,2,4};
            int[] arr1 = new int[arr.length];
            for(int i=0;i<arr.length-1;i++){
                arr1[i]=lcm(arr[i],arr[i+1]);
            }
            int max=0;
            for(int num :arr1){
                if(num>max){
                    max= num;
                }
            }
            System.out.println(max);
        }
    }

