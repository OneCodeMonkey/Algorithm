// AC: Runtime: 2 ms, faster than 50.44% of Java online submissions for Single Number III.
// Memory Usage: 42.1 MB, less than 18.35% of Java online submissions for Single Number III.
// A bit manipulation trick.
// T:O(n), S:O(1)
// 
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor1 = 0;
        int[] ret = {0, 0};
        for (int num: nums) {
            xor1 ^= num;
        }
        int lastBitOne = xor1 & -xor1;
        for (int num: nums) {
            if ((num & lastBitOne) == 0) {
                ret[0] ^= num;
            } else {
                ret[1] ^= num;
            }
        }
        
        return ret;
    }
}