// AC: Runtime: 10 ms, faster than 40.00% of Java online submissions for Longest Subsequence With Limited Sum.
// Memory Usage: 47.6 MB, less than 60.00% of Java online submissions for Longest Subsequence With Limited Sum.
// Prefix Sum + binary search
// T:O(m * log(n)), S:O(n)
// 
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int len = nums.length, sum = 0, pos = 0;
        int[] sumN = new int[len], ret = new int[queries.length];
        for (int i : nums) {
            sum += i;
            sumN[pos++] = sum;
        }
        pos = 0;
        for (int query : queries) {
            ret[pos++] = binarySearch(sumN, query) + 1;
        }

        return ret;
    }

    private int binarySearch(int[] sums, int target) {
        int len = sums.length, left = 0, right = len - 1, middle;
        if (target < sums[left]) {
            return -1;
        }
        do {
            middle = left + (right - left) / 2;
            if (sums[middle] == target) {
                return middle;
            } else if (sums[middle] > target) {
                if (middle - 1 >= 0 && sums[middle - 1] <= target) {
                    return middle - 1;
                }
                right = Math.max(0, middle - 1);
            } else {
                if (middle + 1 < len && sums[middle + 1] == target) {
                    return middle + 1;
                }
                if (middle + 1 < len && sums[middle + 1] > target) {
                    return middle;
                }
                left = Math.min(len - 1, middle + 1);
            }
        } while (left < right);

        return left;
    }
}