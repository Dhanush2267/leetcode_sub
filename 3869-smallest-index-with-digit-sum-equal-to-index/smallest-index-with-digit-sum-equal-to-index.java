class Solution {
    public int smallestIndex(int[] nums) {
        int ans = -1;
        int digit = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            digit = 0;
            while(num > 0)
            {
                int rem = num % 10;
                digit = digit + rem;
                num/=10;
            }
            System.out.println(digit);
            if(digit == i)
            {
                return i;
            }
        }
        return -1;
    }
}