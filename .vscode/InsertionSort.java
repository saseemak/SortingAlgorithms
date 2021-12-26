public class InsertionSort {
    public static void main(String[] args){
        int[] A = new int[]{17,114,10,8,3,1};
        for(int i = 0 ; i< A.length-1; i++)
        {
            int temp = A[i+1];
            int j = i+1;
            while(j!=0 && A[j]<A[j-1])
            {
                A[j] = A[j-1];
                A[j-1] = temp;
                j--;
            }
        }
       for(int n : A){
           System.out.println(n);
       }
     }
      
}

