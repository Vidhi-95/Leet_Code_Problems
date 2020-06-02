class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Here we have used hash map in order to avoid two for loops and reduced complexity by O(N)
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int match_num = target - nums[i];
            // if map already comtains an element satisfying the condition return it else put the numbers in map
            if(map.containsKey(match_num)){
                return new int[]{map.get(match_num),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No such numbers found");
    }
}
