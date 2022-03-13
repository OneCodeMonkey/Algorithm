// AC: Runtime: 3 ms, faster than 100.00% of Java online submissions for Find All K-Distant Indices in an Array.
// Memory Usage: 45.5 MB, less than 66.67% of Java online submissions for Find All K-Distant Indices in an Array.
// .
// T:O(n), S:O(n)
//
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int curIndex = -1;
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                curIndex++;
                if (curIndex >= nums.length) {
                    break;
                }
                for (int j = Math.max(curIndex, i - k); j <= Math.min(i + k, nums.length - 1); j++) {
                    curIndex = j;
                    ret.add(j);
                }
            }
        }

        return ret;
    }
}