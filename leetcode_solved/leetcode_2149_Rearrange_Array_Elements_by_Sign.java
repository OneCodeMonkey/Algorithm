// AC: Runtime: 13 ms, faster than 20.00% of Java online submissions for Rearrange Array Elements by Sign.
// Memory Usage: 77 MB, less than 60.00% of Java online submissions for Rearrange Array Elements by Sign.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>(), negative = new ArrayList<>();
        for (int i: nums) {
            if (i > 0) {
                positive.add(i);
            } else {
                negative.add(i);
            }
        }
        int[] ret = new int[nums.length];
        int pos = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            ret[pos++] = positive.get(i);
            ret[pos++] = negative.get(i);
        }

        return ret;
    }
}