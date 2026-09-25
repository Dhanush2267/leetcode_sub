class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int right = 0;
        int distinct = 0;
        int count = 0;
        int[] freq = new int [100001];
        for( right = 0 ; right < s.length(); right++)
        {
            char ch = s.charAt(right);
            if(freq[ch] == 0)
            {
                distinct++;
            }
            freq[ch]++;
            
            while(distinct == 3)
            {
                count += s.length() - right;
                freq[s.charAt(left)]--;
                if(freq[s.charAt(left)] == 0)
                {
                    distinct--;
                }
                left++;
            }
        }
        return count;
    }
}