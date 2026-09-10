class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int ans=target-nums[i];
            if(map.containsKey(ans))
            {
                return new int[]{i,map.get(ans)};
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}