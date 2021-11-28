// AC: Runtime: 1 ms, faster than 85.71% of Java online submissions for Find Target Indices After Sorting Array.
// Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for Find Target Indices After Sorting Array.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ret = new LinkedList<>();
        int count = 0, num = 0;
        for (int i: nums) {
            if (i < target) {
                count++;
            } else if (i == target) {
                num++;
            }
        }
        for (int i = 0; i < num; i++) {
            ret.add(count + i);
        }

        return ret;
    }
}