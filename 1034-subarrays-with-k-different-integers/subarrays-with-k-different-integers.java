class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return ans(nums,k) - ans(nums,k-1);
    }
        public int ans(int[] nums,int k)
        {
        if(k < 0)
            return k;
        int left = 0;
        int count = 0;
        int distinct = 0;
        int[] freq = new int[100001];
        for(int right = 0; right < nums.length; right++)
        {
            if(freq[nums[right]] == 0)
                distinct++;
            freq[nums[right]]++;
            while(distinct > k)
            {
                freq[nums[left]]--;
                if(freq[nums[left]] == 0)
                {
                    distinct--;
                }
                left++;
            }
            count += right - left + 1;
            
        }
        return count;
    }
}