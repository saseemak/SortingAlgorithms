package leetcode;

//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

public class BinarySearch {
   public static void main(String[] args) {
       int[] nums = new int[]{1,3,5,6};
        int n = nums.length;
       int index = binarySearch(nums, 0 , n-1, 2);
       System.out.println(index);
   }
     public static int binarySearch(int[] nums,int low, int high,int target){
         if(high >= low){
           
        int mid = low + (high - low)/2;
        System.out.println("low "+ low +"high "+high + "mid "+ mid);
         if(nums[mid] == target){
             return mid;
         }
         else if( target < nums[mid]){
            return  binarySearch(nums, low, mid-1, target);
         }
         else if (nums[mid ]< target){
           return  binarySearch(nums,mid+1, high, target);
         }
         else {
            return -1;
         }
         
    }
    System.out.println("low "+ low +"high "+high);
    return -1;
   
        
}

}