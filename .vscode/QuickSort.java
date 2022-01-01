public class QuickSort {
    public static void main(String[] args){
    
           int[] A = new int[]{7,2,1,6,8,5,3,4};
           sort(A,0,A.length-1);
    }
    public static void sort(int[] A , int low, int high)
    {
        if(low < high){
        int partitionIndex = partition(A, low,high);
        sort(A,0,partitionIndex-1);
        sort(A,partitionIndex+1,high);
        }
    } 
    public static int partition(int[] A, int low ,int high){
        int i = low -1;
        int pivot = A[high];
        for(int j = low; j< high; j++)
        {
            if(A[j]< pivot){
                i++;
                swap(A,i,j);
                printArray(A);
                System.out.println();
            }
            
        }
        swap(A,i+1,high);
        printArray(A);
        System.out.println();
        return i+1;
    }
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void printArray(int[] A){
        for(int i : A)
        {
            System.out.print(" "+ i);
           
        }
    }
}
