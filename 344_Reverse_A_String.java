class Solution {
    public void reverseString(char[] s) {
        // Here we will be using two pointer approach and make use of the swap in order to reverse the string
      int left = 0;
      int right = s.length-1;
        
        while(left<=right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left+=1;
            right-=1;
        }
    }
}
