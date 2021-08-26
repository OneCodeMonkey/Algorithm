// AC:
// Runtime: 8 ms, faster than 100.00% of Java online submissions for Incremental Memory Leak.
// Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Incremental Memory Leak.
// simulation... it seems that brute-force can pass. Any way I haven't thought out better solution...
// complexity:  T: O(sqrt(max(m1, m2))), S: O(1)
// 
class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int second = 1;
        while (memory1 >= second || memory2 >= second) {
            if (memory1 >= memory2) {
                if (memory1 >= second) {
                    memory1 -= second;
                } else {
                    break;
                }
            } else {
                if (memory2 >= second) {
                    memory2 -= second;
                } else {
                    break;
                }
            }
            second++;
        }
        int[] ret = new int[]{second, memory1, memory2};
        return ret;
    }
}
