// Solution 1: O(n^2)
// AC: Runtime: 1558 ms, faster than 5.00% of Java online submissions for Subarray Sum Equals K.
// Memory Usage: 41.2 MB, less than 87.24% of Java online submissions for Subarray Sum Equals K.
// record the accumulated sum of nums, and for two loops check whether sum equal to k.
// T:O(n^2), S:O(n)
// 
class Solution {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length, tempSum = 0, ret = 0;
        int[] sum = new int[size + 1], maxSum = new int[size + 1], minSum = new int[size + 1];
        sum[0] = 0;
        maxSum[0] = 0;
        minSum[0] = 0;
        for (int i = 0; i < size; i++) {
            tempSum += nums[i];
            sum[i + 1] = tempSum;
            if (nums[i] >= 0) {
                maxSum[i + 1] = Math.max(sum[i + 1], nums[i]);
                minSum[i + 1] = minSum[i];
            } else {
                maxSum[i + 1] = maxSum[i];
                minSum[i + 1] = Math.min(sum[i + 1], nums[i]);
            }
        }

        for (int i = 0; i < size; i++) {
            if (maxSum[i + 1] + 1000 * (size - 1 - i) < k || minSum[i + 1] - 1000 * (size - 1 - i) > k) {
                continue;
            }
            for (int j = i; j < size; j++) {
                if (sum[j + 1] - sum[i] == k) {
                    ret++;
                }
            }
        }

        return ret;
    }
}

// Solution 2: O(n), prefixSum + hashmap
// AC: Runtime: 17 ms, faster than 96.08% of Java online submissions for Subarray Sum Equals K.
// Memory Usage: 41 MB, less than 93.12% of Java online submissions for Subarray Sum Equals K.
// using prefixSum and hashmap to check how many range (i, j) prefixSum diff is equal to k
// T:O(n), S:O(n)
// 
class Solution {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length, tempSum = 0, ret = 0;
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);
        for (int i: nums) {
            tempSum += i;
            if (sumCount.containsKey(tempSum - k)) {
                ret += sumCount.get(tempSum - k);
            }
            if (sumCount.get(tempSum) != null) {
                sumCount.put(tempSum, sumCount.get(tempSum) + 1);
            } else {
                sumCount.put(tempSum, 1);
            }
        }

        return ret;
    }
}
