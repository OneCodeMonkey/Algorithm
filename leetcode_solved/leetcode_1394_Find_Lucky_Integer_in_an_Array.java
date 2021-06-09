// AC: Runtime: 8 ms, faster than 10.15% of Java online submissions for Find Lucky Integer in an Array.
// Memory Usage: 40.5 MB, less than 7.66% of Java online submissions for Find Lucky Integer in an Array.
// hashmap
// T:O(n), S:O(n)
//
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i: arr) {
            record.merge(i, 1, Integer::sum);
        }
        int ret = -1;
        for (int i: arr) {
            if (i == record.get(i)) {
                ret = Math.max(ret, i);
            }
        }
        
        return ret;
    }
}