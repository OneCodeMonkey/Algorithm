// AC: Runtime 5 ms Beats 100% 
// Memory 42.8 MB Beats 100%
// .
// T:O(n * logn), S:O(n)
//
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> digits = new LinkedList<>();
        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();
            while (num > 0) {
                int digit = num % 10;
                temp.add(digit);
                num /= 10;
            }
            for (int i = temp.size() - 1; i >= 0; i--) {
                digits.add(temp.get(i));
            }
        }

        int[] ret = new int[digits.size()];
        int pos = 0;
        for (int i : digits) {
            ret[pos++] = i;
        }

        return ret;
    }
}
