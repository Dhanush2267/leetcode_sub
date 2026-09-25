class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int distinct = 0;
        int maxLength = 0;
        int[] freq = new int[1000001];
        for(int right = 0; right < fruits.length; right++)
        {
            if(freq[fruits[right]] == 0)
            {
                distinct++;
            }
            freq[fruits[right]]++;
            while(distinct > 2)
            {
                freq[fruits[left]]--;
                if(freq[fruits[left]] == 0)
                {
                    distinct--;
                }
                left++;
                
            }
            if(distinct <= 2)
            {
                maxLength = Math.max(maxLength , right - left + 1);
            }

        }
        return maxLength;
    }
}