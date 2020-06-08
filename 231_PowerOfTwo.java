class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        // Here we will keep on dividing the number until it becomes 1, if in between we get an odd number we return false
        while(n!=1){
            if(n%2 != 0)
                return false;
            n=n/2;
        }
        return true;
    }
}
