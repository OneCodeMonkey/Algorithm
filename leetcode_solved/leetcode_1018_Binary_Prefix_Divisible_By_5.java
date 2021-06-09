// AC: Runtime: 3 ms, faster than 59.64% of Java online submissions for Binary Prefix Divisible By 5.
// Memory Usage: 39.6 MB, less than 54.20% of Java online submissions for Binary Prefix Divisible By 5.
// every bit remain the cur % 10, and check (cur * 2 + bit) % 5 == 0.
// T:O(n), S:O(1)
//
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ret = new LinkedList<>();
        int cur = 0;
        for (int num : nums) {
            cur = cur * 2 + num;
            ret.add(cur % 5 == 0);
            cur %= 10;
        }

        return ret;
    }
}