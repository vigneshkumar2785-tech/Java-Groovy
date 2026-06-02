class npattern{
    public static void main(String[] args) {
        int row = 3;
        int col = 5;
        int count = 1;
        for(int i = 0; i< row ; i++)
        {
            for(int j =0 ;j<col;j++)
            {
                if((i==j) ||(i+j ==col-1))
                {
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }

}


//Expected Output
/*
1       2
  3   4
    5
 */