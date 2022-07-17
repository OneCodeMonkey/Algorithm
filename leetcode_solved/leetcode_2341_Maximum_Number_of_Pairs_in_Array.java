// AC: Runtime: 5 ms, faster than 20.00% of Java online submissions for Maximum Number of Pairs in Array.
// Memory Usage: 42.2 MB, less than 80.00% of Java online submissions for Maximum Number of Pairs in Array.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int[] ret = new int[2];
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        int pairs = 0;
        for (int i : record.keySet()) {
            pairs += record.get(i) / 2;
        }
        ret[0] = pairs;
        ret[1] = nums.length - pairs * 2;

        return ret;
    }
}
