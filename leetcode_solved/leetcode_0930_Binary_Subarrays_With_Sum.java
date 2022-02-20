// Solution 1: prefix sum, this also can use where there exists negative number in array.
// AC: Runtime: 38 ms, faster than 21.70% of Java online submissions for Binary Subarrays With Sum.
// Memory Usage: 59.5 MB, less than 18.97% of Java online submissions for Binary Subarrays With Sum.
// prefix sum + hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int sum = 0, ret = 0;
        record.put(0, 1);
        for (int num:nums) {
            sum += num;
            if (record.containsKey(sum - goal)) {
                ret += record.get(sum - goal);
            }
            record.merge(sum, 1, Integer::sum);
        }

        return ret;
    }
}

// Solution 2: sliding window
// AC: Runtime: 2 ms, faster than 92.93% of Java online submissions for Binary Subarrays With Sum.
// Memory Usage: 54.7 MB, less than 44.69% of Java online submissions for Binary Subarrays With Sum.
// sliding window
// T:O(n), S:O(1)
//
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return targetSumAtMostK(nums, goal) - targetSumAtMostK(nums, goal - 1);
    }

    public int targetSumAtMostK(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        int leftPos = 0, ret = 0;
        for (int i = 0; i < nums.length; i++) {
            goal -= nums[i];
            while (goal < 0) {
                goal += nums[leftPos++];
            }
            ret += i - leftPos + 1;
        }

        return ret;
    }
}