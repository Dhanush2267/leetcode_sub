class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int[] freq = new int[256];
        for(int right = 0; right < s.length(); right++)
        {
            char ch = s.charAt(right);
            while(freq[ch]==1)
            {
                freq[s.charAt(left)]--;
                left++;;
            }
            maxLength = Math.max(maxLength,right - left + 1 );
            freq[ch]++;
        }
        return maxLength;
    }
}