// Runtime 70 ms Beats 100.00% of users with Java
// Memory 60.93 MB Beats 100.00% of users with Java
// Hashmap.
// T:O(n * log(n)), S:O(n * log(n))
// 
class Solution {
    public long sumDigitDifferences(int[] nums) {
        List<HashMap<Integer, Integer>> digitRecord = new ArrayList<>();
        int len = nums.length, maxDigit = 0;
        for (int i = 0; i < len; i++) {
            int num = nums[i], exp = 0;
            while (num > 0) {
                int digit = num % 10;
                if (digitRecord.size() < exp + 1) {
                    digitRecord.add(new HashMap<>());
                }
                digitRecord.get(exp).merge(digit, 1, Integer::sum);
                exp++;
                num /= 10;
                if (i == 0) {
                    maxDigit = exp;
                }
            }
        }
        long ret = 0;
        for (int i = 0; i < maxDigit; i++) {
            HashMap<Integer, Integer> digitRecord1 = digitRecord.get(i);
            List<Integer> digits = new ArrayList<>(digitRecord1.keySet());
            Collections.sort(digits);
            for (int j = 0; j < digits.size(); j++) {
                for (int k = j + 1; k < digits.size(); k++) {
                    ret += (long) digitRecord1.get(digits.get(j)) * digitRecord1.get(digits.get(k));
                }
            }
        }

        return ret;
    }
}
