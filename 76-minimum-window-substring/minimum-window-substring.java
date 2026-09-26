class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int count = 0;
        int index = 0;
        int minLength = Integer.MAX_VALUE;
        int[] freq = new int [100001];
        for(int i = 0; i < t.length(); i++)
        {
            char car = t.charAt(i);
            freq[car]++;
        }
        while(right < s.length())
        {
            char ch = s.charAt(right);
            if(freq[ch] > 0)
            {
                count++;
            }
            freq[ch]--;
            while(count == t.length())
            {
                
                if(right - left + 1 < minLength)
                {
                    minLength = right - left + 1;
                    index = left; 
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)] > 0)
                    count--;
                left++;
            }
            right++;
        }
        if (minLength == Integer.MAX_VALUE)
            return "";
        return s.substring(index , index + minLength);
    }
}