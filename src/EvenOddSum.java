public class EvenOddSum {
    public static void main(String[] args) {
        int arr[] = {16,10,7,17,12,8,2,9};
        int esum = 0;
        int osum =0;
        for(int i =0 ;i < arr.length; i++)
        {
            if(arr[i] % 2 ==0)
            {
                esum = esum + arr[i];
            }
            else{
                osum = osum + arr[i];
            }
        }
        System.out.println("Even Sum is :"+esum);
        System.out.println("Odd sum is :"+ osum);
    }
}



