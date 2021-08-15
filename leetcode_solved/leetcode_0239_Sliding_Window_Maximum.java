// Solution1: treemap
// AC: Runtime: 700 ms, faster than 5.00% of Java online submissions for Sliding Window Maximum.
// Memory Usage: 128.4 MB, less than 8.80% of Java online submissions for Sliding Window Maximum.
// using treemap of size k, to get the highest element
// T:O(nlogk), S:O(k)
//
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int[] ret = new int[size - k + 1];

        TreeMap<Integer, Integer> record = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < k; i++) {
            record.merge(nums[i], 1, Integer::sum);
        }
        ret[0] = record.firstKey();

        for (int i = k; i < size; i++) {
            int time = record.get(nums[i - k]);
            if (time <= 1) {
                record.remove(nums[i - k]);
            } else {
                record.merge(nums[i - k], -1, Integer::sum);
            }
            record.merge(nums[i], 1, Integer::sum);

            ret[i - k + 1] = record.firstKey();
        }

        return ret;
    }
}