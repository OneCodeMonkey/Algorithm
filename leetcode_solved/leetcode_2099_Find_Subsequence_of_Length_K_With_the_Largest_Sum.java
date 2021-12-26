// AC: Runtime: 5 ms, faster than 100.00% of Java online submissions for Find Subsequence of Length K With the Largest Sum.
// Memory Usage: 38.8 MB, less than 71.43% of Java online submissions for Find Subsequence of Length K With the Largest Sum.
// sorting, and hashmap recording topK. then one loop to get answer by original order of the array.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int size = nums.length, pos = 0;
        int[] numsCopy = new int[size];
        System.arraycopy(nums, 0, numsCopy, 0, size);
        Arrays.sort(numsCopy);
        int[] ret = new int[k];
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = size - 1; i >= size - k; i--) {
            record.merge(numsCopy[i], 1, Integer::sum);
        }
        for (int i = 0; i < size; i++) {
            if (record.containsKey(nums[i]) && record.get(nums[i]) > 0) {
                ret[pos++] = nums[i];
                record.merge(nums[i], -1, Integer::sum);
            }
        }

        return ret;
    }
}