public class ShellSort {
    public static void main(String[] args){
       int[] nums = new int[]{2,7,9,5,23,29,15,19,3};
       shellSort(nums);
       printArray(nums);
    }
    public static void shellSort(int[] nums){
        int n = nums.length;
        for(int gap = n/2;gap >= 1; gap= gap/2){
          for(int j = gap;j< n; j++){
              for(int i = j-gap; i>=0;i= i-gap){
                  if(nums[i+gap] > nums[i]){
                      break;
                  }
                  else{
                      int temp = nums[i+gap];
                      nums[i+gap] = nums[i];
                      nums[i] = temp;
                  }
              }
          }
        }
    }
    public static void printArray(int[] nums){
        for(int element: nums){
            System.out.print(element + " ");
        }
    }
}
