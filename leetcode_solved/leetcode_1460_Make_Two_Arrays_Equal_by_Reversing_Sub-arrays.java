// AC: Runtime: 6 ms, faster than 21.66% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
// Memory Usage: 39.1 MB, less than 32.52% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
// 。
// T:O(n), S:O(n)
// 
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            record.merge(target[i], 1, Integer::sum);
            record.merge(arr[i], -1, Integer::sum);
        }
        
        for (int i: record.keySet()) {
            if (record.get(i) != 0) {
                return false;
            }
        }
        return true;
    }
}