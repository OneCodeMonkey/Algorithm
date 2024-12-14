// Runtime 5 ms Beats 100.00%
// Memory 44.92 MB Beats 100.00%
// To make all equal, the final result must be <= smallest one.
// T:O(n + klogk), S:O(k), k = unique numbers.
//
class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> record = new HashSet<>();
        for (int num : nums) {
            record.add(num);
        }
        List<Integer> unique = new ArrayList<>(record);
        Collections.sort(unique);

        if (k > unique.get(0)) {
            return -1;
        } else if (k == unique.get(0)) {
            return unique.size() - 1;
        } else {
            return unique.size();
        }
    }
}
