// AC: Runtime 0 ms Beats 100%
// Memory 41.2 MB Beats 100%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ret = 0;
        for (int hour : hours) {
            if (hour >= target) {
                ret++;
            }
        }

        return ret;
    }
}
