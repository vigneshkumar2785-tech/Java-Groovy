public class Shoprs
{
    static boolean Transaction(int[] arr, int length){
        int countof30 =0;
        int countof60 = 0;
        int countof120 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==30){
                countof30++;
            }
            else if(arr[i]==60){
                if(countof30>0){
                    countof60++;
                    countof30--;
                }
                else{
                    return false;
                }
            }
            else if(arr[i]==120) {
                if(countof60>0 && countof30>0){
                    countof120++;
                    countof60--;
                    countof30--;
                }
                else if(countof30 > 2)
                {
                    countof120++;
                    countof30 = countof30-3;
                }
                else{
                    return false;
                }
}

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {30,30,30};
        boolean result = Transaction(arr,arr.length);
        if(result){
            System.out.println("Transaction Successful");
        }
        else{
            System.out.println("unsuccessfull Transaction");
        }
    }
}

