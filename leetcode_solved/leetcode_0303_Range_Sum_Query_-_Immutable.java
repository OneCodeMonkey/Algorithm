// AC: Runtime: 6 ms, faster than 100.00% of Java online submissions for Range Sum Query - Immutable.
// Memory Usage: 44.1 MB, less than 13.72% of Java online submissions for Range Sum Query - Immutable.
// prefix sum
// T:O(1), S:O(n)
//
class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        int tempSum = 0, pos = 1;
        for (int i: nums) {
            tempSum += i;
            prefixSum[pos++] = tempSum;
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}