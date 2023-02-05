// AC: Runtime 36 ms Beats 75% 
// Memory 43.5 MB Beats 87.50%
// HashSet.
// T:O(n), S:O(m), m = banned.length
// 
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> record = new HashSet<>(banned.length);
        for (int i : banned) {
            record.add(i);
        }
        int sum = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (!record.contains(i)) {
                sum += i;
                count++;
                if (sum >= maxSum) {
                    return sum == maxSum ? count : count - 1;
                }
            }
        }

        return count;
    }
}
