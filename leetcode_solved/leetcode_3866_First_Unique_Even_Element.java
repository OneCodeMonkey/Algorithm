// Runtime 6 ms Beats 2.26% 
// Memory 46.24 MB Beats 60.93%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        for (int num : nums) {
            if (num % 2 == 0 && record.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}
