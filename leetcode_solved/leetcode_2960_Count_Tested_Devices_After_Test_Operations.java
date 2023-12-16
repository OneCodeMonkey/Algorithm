// AC: Runtime 0 ms Beats 100.00% of users with Java
// Memory 42.94 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int curDecr = 0;
        for (int i : batteryPercentages) {
            if (i > curDecr) {
                curDecr++;
            }
        }
        return curDecr;
    }
}
