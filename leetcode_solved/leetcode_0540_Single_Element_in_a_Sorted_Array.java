// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Element in a Sorted Array.
// Memory Usage: 39.1 MB, less than 52.14% of Java online submissions for Single Element in a Sorted Array.
// bit manipulation, a ^ a = 0.
// T:O(n), S:O(1)
// 
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ret = 0;
        for (int i: nums) {
            ret ^= i;
        }
        
        return ret;
    }
}