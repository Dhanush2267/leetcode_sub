class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return ans(nums,k) - ans(nums,k-1);
    }
        public int ans(int[] nums , int k)
        {
            if(k < 0)
                return 0;
        int left = 0;
        int count = 0;
        int sum = 0;
        for(int right = 0; right < nums.length; right++)
        {
            if(nums[right] % 2 == 0)
            {
                nums[right] = 0;
            }
            else
            {
                nums[right] = 1;
            }
            sum += nums[right];
            while(sum > k)
            {
                sum -=nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
        }
    }
