// AC: Runtime: 1 ms, faster than 77.22% of Java online submissions for 2 Keys Keyboard.
// Memory Usage: 41.8 MB, less than 16.24% of Java online submissions for 2 Keys Keyboard.
// dp.
// T:O(n), S:O(n)
// 
class Solution {
    public int minSteps(int n) {
        HashMap<Integer, Integer> record = new HashMap<>();
        record.put(1, 0);
        record.put(2, 2);
        solve(n, record);

        return record.get(n);
    }

    public int solve(int n, HashMap<Integer, Integer> record) {
        if (record.containsKey(n)) {
            return record.get(n);
        }
        int ret = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                ret = Math.min(ret, n / i + solve(i, record));
            }
        }
        record.put(n, ret);
        return ret;
    }
}