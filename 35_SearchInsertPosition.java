class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        // we will either find the exact match or we will find a number that is greater than target
        for(i=0;i<nums.length;i++){
            if(nums[i] == target || nums[i] > target) 
                return i;
    
        }
        // if we do not find the target in the entire array and reach the end of the array then we will insert it at the last position
        return i;
    }
}
