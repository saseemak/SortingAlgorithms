public class MergeSort {
    public static void main(String[] args){
     int[] A = new int[]{12, 11, 13, 5, 6, 7 };
     Sort(A);
     printArray(A);
 }

 public static void Sort(int[] A){
     printArray(A);
     System.out.println();
     int aLength = A.length;
     if(aLength > 2)
     {
     int mid = aLength/2;
     int[] lsa = new int[mid];
     int[] rsa = new int[aLength-mid];
     for(int i = 0; i < mid ; i++){
         lsa[i] = A[i];    
     }
     for(int j = 0; j < rsa.length ; j++){
         rsa[j] = A[mid+j];
     }
     Sort(lsa);
     Sort(rsa);
     Merge(A,lsa,rsa);
    }
     
 }
public static void Merge(int[] A, int[] L, int[] R){
    int i = 0;
    int j = 0;
    int k =0 ;
     while(i< L.length && j < R.length)
     {
       if(L[i] <= R[j])
       {
           A[k] = L[i];
           k++;
           i++;
       }
       else{
           A[k] = R[j];
           k++;
           j++;
       }
     }
     while(i < L.length){
        A[k] = L[i];
        k++;
        i++;
     }
     while(j < R.length){
        A[k] = R[j];
        k++;
        j++;
     }

}
public static void printArray(int[] arr)
{
    for(int m: arr)
    {
        System.out.print(" "+m);
       
    }
}
}