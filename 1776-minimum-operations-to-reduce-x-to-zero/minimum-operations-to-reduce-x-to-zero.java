class Solution {
    public int minOperations(int[] nums, int x) {
        int left = 0;
        int maxLength = -1;
        int firstSum = 0;
        int sum = 0;
        for(int y : nums)
            firstSum += y;
        int k = firstSum - x;
        if( k < 0)
            return -1;
        for(int right = 0; right < nums.length; right++)
        {
            sum += nums[right];
           
            while(sum > k)
            {
                sum -= nums[left];
                left++;
            }
             if(sum == k)
            {
                maxLength = Math.max(maxLength,right - left + 1);
            }
        }
        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}