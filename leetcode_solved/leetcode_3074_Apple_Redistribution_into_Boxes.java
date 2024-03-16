// Runtime 1 ms Beats 100.00% of users with Java
// Memory 41.66 MB Beats 100.00% of users with Java
// .
// T:O(n + mlogm), S:O(logm)
// 
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0, cur = 0;
        for (int i : apple) {
            sum += i;
        }
        Arrays.sort(capacity);
        for (int i = capacity.length - 1; i >= 0; i--) {
            cur += capacity[i];
            if (cur >= sum) {
                return capacity.length - i;
            }
        }

        return -1;
    }
}
