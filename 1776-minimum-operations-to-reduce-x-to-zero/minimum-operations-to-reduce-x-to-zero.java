class Solution {
    public int minOperations(int[] nums, int x) {
        int firstSum = 0;
        for(int i : nums)
        firstSum+=i;
        int ans = firstSum - x;
        if(ans < 0)
        return -1;
        int left = 0;
       // int right = 0;
        int maxLength = -1;
        int sum = 0;
        for(int right = 0; right < nums.length; right++)
        {
            sum = sum + nums[right];
            while(sum > ans)
            {
                sum = sum - nums[left];
                left++;
            }
            if(sum == ans)
            {
                maxLength = Math.max(maxLength,right - left + 1);
            }
            
        }
        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}