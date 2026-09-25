class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long maxLength = 0;
        long sum = 0;
        int distinct = 0;
        int[] freq = new int[100001];
        for(int right = 0; right < nums.length; right++)
        {
            
                sum += nums[right];
                if(freq[nums[right]]==0)
                    distinct++;
                freq[nums[right]]++;
                if(right - left + 1 > k)
                {
                    sum -= nums[left];
                    freq[nums[left]]--;
                    if(freq[nums[left]]==0)
                        distinct--;
                    left++;
                }
            if(right - left + 1 == k && distinct == k)
            {            
                System.out.println(sum);
                maxLength = Math.max(sum,maxLength);
              
            }
        }
    return maxLength;
    }
}