public class CountSort {
     public static void main(String[] args) {
         int[] A = new int[]{1,3,2,3,4,1,6,4,3};
         sort(A);
         printArray(A);
    }
    public static int findMax(int[] A){
        int max = A[0];
        int len = A.length;
        for(int i =1; i< len ; i++){
            max = max>A[i] ? max: A[i];
        }
       return max;
    }
    public static void sort( int[] A){
        int max = findMax(A);
        int[] count = new int[max+1];
        int[] sortedArray = new int[A.length];
        for(int i=0; i< A.length ; i++){
            count[A[i]]++;
        }
        for(int i=1; i< count.length ; i++){
            count[i] = count[i]+ count[i-1];
        }
        for(int i = A.length-1; i>= 0; i--){
            sortedArray[--count[A[i]]] = A[i];
        }
       for(int i = 0; i< A.length ;i++)
       {
           A[i] = sortedArray[i];
       }
        
    }
    public static void printArray(int[] A)
    {
        for (int  element : A) {
            System.out.println(element);
    }

 }
}
