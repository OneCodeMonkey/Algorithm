// AC: Runtime: 41 ms, faster than 66.47% of Java online submissions for All Divisions With the Highest Score of a Binary Array.
// Memory Usage: 126.1 MB, less than 74.26% of Java online submissions for All Divisions With the Highest Score of a Binary Array.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int leftCountZero = 0, rightCountOne = 0, totalOne = 0, curMaxValue = 0;
        List<Integer> ret = new LinkedList<>();
        for (int num : nums) {
            if (num == 1) {
                totalOne++;
            }
        }
        rightCountOne = totalOne;
        curMaxValue = totalOne;
        ret.add(0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                leftCountZero++;
            } else {
                rightCountOne--;
            }
            if (leftCountZero + rightCountOne > curMaxValue) {
                curMaxValue = leftCountZero + rightCountOne;
                ret.clear();
                ret.add(i + 1);
            } else if (leftCountZero + rightCountOne == curMaxValue) {
                ret.add(i + 1);
            }
        }

        return ret;
    }
}