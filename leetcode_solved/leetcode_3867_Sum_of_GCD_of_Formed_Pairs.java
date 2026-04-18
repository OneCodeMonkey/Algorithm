// Runtime 97 ms Beats 5.49% 
// Memory 124.82 MB Beats 29.28%
// .
// T:O(nlogn), S:O(n)
// 
class Solution {
    public long gcdSum(int[] nums) {
        int maxVal = 0, len = nums.length;
        List<Integer> record = new ArrayList<>();
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
            record.add(gcd(maxVal, num));
        }
        Collections.sort(record);
        long ret = 0;
        for (int i = 0; i < record.size() / 2; i++) {
            ret += gcd(record.get(i), record.get(record.size() - 1 - i));
        }

        return ret;
    }

    private int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        return b % a == 0 ? a : gcd(b % a, a);
    }
}
