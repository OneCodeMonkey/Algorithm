// Runtime 38 ms Beats 99.25% of users with Java
// Memory 57.62 MB Beats 62.44% of users with Java
// Sort & hashmap.
// T:O(nlogn), S:O(1) ~ O(n)
// 
class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (k == 1) {
            return true;
        }
        int len = nums.length;
        if (len % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        HashMap<Integer, Integer> record = new HashMap<>();
        record.put(nums[0], 1);
        int countSame = 1, maxDup = len / k;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                countSame++;
                if (countSame > maxDup) {
                    return false;
                }
            } else {
                countSame = 1;
            }
            record.merge(nums[i], 1, Integer::sum);
        }
        for (int elem : nums) {
            if (record.getOrDefault(elem, 0) == 0) {
                continue;
            }
            record.merge(elem, -1, Integer::sum);
            for (int j = elem + 1; j <= elem + k - 1; j++) {
                if (record.getOrDefault(j, 0) == 0) {
                    return false;
                }
                record.merge(j, -1, Integer::sum);
            }
        }

        return true;
    }
}
