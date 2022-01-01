public class BubbleSort {
    public static void main(String[] args){
        int[] A = new int[] {17,114,10,8,3,1};
        for(int i = 0 ; i<A.length-1; i++){
            int flag = 0;
            for(int j=0; j< A.length-i-1; j++ )
            {
                if(A[j]>A[j+1]){
                    flag = 1;
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;

                }
            }
            if(flag == 0){
                break;
            }
        }

        for(int n: A)
        {
            System.out.print(" " + n);
        }

    }
    
}
