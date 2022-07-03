// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum XOR After Operations .
// Memory Usage: 53.1 MB, less than 100.00% of Java online submissions for Maximum XOR After Operations .
// in this case, the final result is combine every binary bit that value 1, so just bitwise OR every elements.
// T:O(n), S:O(1)
// 
class Solution {
    public int maximumXOR(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret |= num;
        }
        return ret;
    }
}