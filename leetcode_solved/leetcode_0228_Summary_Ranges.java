// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Summary Ranges.
// Memory Usage: 37.3 MB, less than 72.80% of Java online submissions for Summary Ranges.
// 略。
// T:O(n), S:O(1)
// 
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int size = nums.length;
        List<String> ret = new LinkedList<>();
        if (size == 0) {
            return ret;
        }
        if (size == 1) {
            ret.add(String.valueOf(nums[0]));
            return ret;
        }
        int rangeStart = nums[0], rangeEnd = nums[0];
        for (int i = 1; i < size; i++) {
            StringBuilder temp = new StringBuilder();
            if (nums[i] - nums[i - 1] == 1) {
                rangeEnd = nums[i];
                if (i == size - 1) {
                    temp.append(rangeStart);
                    temp.append("->");
                    temp.append(rangeEnd);
                    ret.add(temp.toString());
                }
            } else {
                if (rangeStart != rangeEnd) {
                    temp.append(rangeStart);
                    temp.append("->");
                    temp.append(rangeEnd);
                } else {
                    temp.append(rangeStart);
                }
                ret.add(temp.toString());
                rangeStart = nums[i];
                rangeEnd = nums[i];
                if (i == size - 1) {
                    ret.add(String.valueOf(rangeStart));
                }
            }
        }

        return ret;
    }
}