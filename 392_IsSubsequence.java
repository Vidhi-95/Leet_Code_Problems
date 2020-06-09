class Solution {
    public boolean isSubsequence(String s, String t) {
        // if s.length = 0 then it will definitely be a subsequence
        if(s.length() == 0) return true;
        int s_ptr = 0;
        int t_ptr = 0;
        // as the index starts from 0 we need to have t_ptr < t.length() instead of <=
        while(t_ptr<t.length()){
            if(t.charAt(t_ptr) == s.charAt(s_ptr)){
                s_ptr ++;
                
                if(s_ptr == s.length()) return true;    
            }
            t_ptr++;
        }
        return false;
    }
}
