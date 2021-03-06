/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
 * Find the minimum element. You may assume no duplicate exists in the array.
 */
 
 public class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while(nums[low] > nums[high]){
            int mid = (low + high) / 2;
            
            if(nums[high] < nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        
        return nums[low];
    }
}
