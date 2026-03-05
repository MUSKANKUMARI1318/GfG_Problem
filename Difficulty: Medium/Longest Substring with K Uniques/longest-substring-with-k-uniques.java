class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int left = 0;
        int maxLen = -1;
        
        int[] freq = new int[26];
        int distinct = 0;
        
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(freq[ch - 'a']==0)
            distinct++;
            
            freq[ch - 'a']++;
            
            while(distinct > k){
                char leftChar = s.charAt(left);
                
                freq[leftChar - 'a']--;
                if(freq[leftChar - 'a']==0)
                distinct--;
                
                left++;
            }
            if(distinct == k)
            maxLen = Math.max(maxLen,right-left + 1);
        }
        return maxLen;
    }
}