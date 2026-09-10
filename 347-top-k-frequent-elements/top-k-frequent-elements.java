
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int x : map.values()) {
            list.add(x);
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {

            int ans = list.get(i);
            int ans1 = 0;

            for (Integer key : map.keySet()) {
                if (map.get(key) == ans) {
                    ans1 = key;
                    break;
                }
            }

            ret[i] = ans1;

            map.remove(ans1);
        }

        return ret;
    }
}

