// AC: Runtime: 25 ms, faster than 18.51% of Java online submissions for Degree of an Array.
// Memory Usage: 43.3 MB, less than 48.99% of Java online submissions for Degree of an Array.
// hashmap record occur times and max-time element's start-index and end-index.
// T:O(n), S:O(n)
// 
class Solution {
    public int findShortestSubArray(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return 1;
        }
        HashMap<Integer, Integer> time = new HashMap<>();
        HashMap<Integer, List<Integer>> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            time.merge(nums[i], 1, Integer::sum);
            if (index.get(nums[i]) == null) {
                List<Integer> temp = new LinkedList<>();
                temp.add(i);
                index.put(nums[i], temp);
            } else {
                if (index.get(nums[i]).size() == 1) {
                    index.get(nums[i]).add(i);
                } else {
                    index.get(nums[i]).remove(1);
                    index.get(nums[i]).add(i);
                }
            }
        }
        int maxTime = 0;
        List<Integer> maxTimeElement = new LinkedList<>();
        for (int i: time.keySet()) {
            if (time.get(i) > maxTime) {
                maxTime = time.get(i);
            }
        }
        if (maxTime == 1) {
            return 1;
        }
        for (int i: time.keySet()) {
            if (time.get(i) == maxTime) {
                maxTimeElement.add(i);
            }
        }
        int ret = size;
        for (int i: maxTimeElement) {
            int tempLen = index.get(i).get(1) - index.get(i).get(0) + 1;
            if (tempLen < ret) {
                ret = tempLen;
            }
        }

        return ret;
    }
}