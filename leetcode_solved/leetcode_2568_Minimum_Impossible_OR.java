// AC: Runtime 27 ms Beats 54.71% 
// Memory 55 MB Beats 58.14%
// See some regularity, we need to find 2^n from 1, 2, 4, ... ,if not exist, then it's the answer.
// T:O(n), S:O(n + 32)
//
class Solution {
    public int minImpossibleOR(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        for (int num : nums) {
            record.add(num);
        }
        int base = 0, powResult = (int) Math.pow(2, base);
        while (record.contains(powResult)) {
            base++;
            powResult = (int) Math.pow(2, base);
        }

        return powResult;
    }
}
