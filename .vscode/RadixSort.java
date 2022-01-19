public class RadixSort{
    public static void main(String[] args){
        int[] A  = new int[]{432,8,530,90,88,231,11,45,677,199};
        radixSort(A);
        System.out.println();
    }
    public static void radixSort(int[] A){
        int max = findMaxElement(A);
        for(int pos = 1; max/pos > 0 ; pos= pos*10){
           countSort(A, pos);
        }
    }
    public static void countSort(int[] A, int pos){
      int n =A.length;
      int[] count = new int[10];
      int[] tempArray = new int[n];
      
      for(int i = n-1 ; i>=0; i-- ){
          ++count[(A[i]/pos)%10];
      }
      for(int i =1;i< count.length;i++){
          count[i] = count[i]+count[i-1];
      }
      for(int i=n-1;i>=0;i--){
       tempArray[--count[(A[i]/pos)%10]] = A[i];
      }
       for(int i = 0; i< n ; i++){
           A[i] = tempArray[i];
       }
       printArray(A);
       System.out.println();
    }
    public static int findMaxElement(int[] A){
        int max = A[0];
        for(int i=1; i<A.length;i++){
            max = max>A[i]?max:A[i];
        }
        return max;
    }
    public static void printArray(int[] A){
       for (int element : A) {
           System.out.print(element + " ");
       }
    }
}