class Solution {
// Used concept of dynamic programming
    public int change(int amount, int[] coins) {
        int[] arr = new int[amount +1];
        arr[0] = 1;
        for(int c:coins){
            for(int j = c;j<= amount; ++j)
                arr[j]+= arr[j-c];
        }
        return arr[amount];
    }
}
