// AC: Runtime 16 ms Beats 100%
// Memory 55.4 MB Beats 100%
// Map
// T:O(n), S:O(n)
// 
class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        int ret = 0;
        for (int key : record.keySet()) {
            int time = record.get(key);
            if (time == 1) {
                return -1;
            }
            if (time % 3 == 0) {
                ret += time / 3;
            } else if (time % 3 == 1) {
                ret += time / 3 + 1;
            } else {
                ret += time / 3 + 1;
            }
        }

        return ret;
    }
}
