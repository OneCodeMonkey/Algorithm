// AC: Runtime: 497 ms, faster than 30.00% of Java online submissions for Tuple with Same Product.
// Memory Usage: 144.8 MB, less than 39.33% of Java online submissions for Tuple with Same Product.
// since the element is distinct, if arr[i]*arr[j] differs, then a,b,c,d must be differs.
// T:O(n^2), S:O(n)
// 
class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int size = nums.length, ret = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = nums[i] * nums[j];
                record.merge(sum, 1, Integer::sum);
            }
        }

        for (int sum: record.keySet()) {
            int sameSumCount = record.get(sum);
            ret += sameSumCount * (sameSumCount - 1) * 4;
        }

        return ret;
    }
}