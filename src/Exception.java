public class Exception {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int arr1[] = {0,1,2,3,4};

        for(int i =0 ;i<arr.length ;i++)
        {
            try{
                System.out.println(arr[i] /arr1[i]);
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
        }
    }
}