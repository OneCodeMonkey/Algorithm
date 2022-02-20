// AC: Runtime: 4 ms, faster than 100.00% of Java online submissions for Count Equal and Divisible Pairs in an Array.
// Memory Usage: 41.9 MB, less than 28.57% of Java online submissions for Count Equal and Divisible Pairs in an Array.
// straight forward. we can use hashmap to reduce some loops.
// T:O(n^2), S:O(n)
//
class Solution {
    public int countPairs(int[] nums, int k) {
        int ret = 0;
        HashMap<Integer, List<Integer>> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey(nums[i])) {
                for (int j: record.get(nums[i])) {
                    if (i * j % k == 0) {
                        ret++;
                    }
                }
                record.get(nums[i]).add(i);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(i);
                record.put(nums[i], tempList);
            }
        }

        return ret;
    }
}